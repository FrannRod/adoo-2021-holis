package controlador;
import java.util.Date;
import modelo.dominio.OfertaLaboral;
import modelo.dominio.Postulante;
import modelo.dominio.Categoria;
import modelo.vo.OfertaLaboralVO;
import modelo.vo.PostulanteVO;
import java.util.ArrayList;
import java.util.Dictionary;
public class ControladorOfertaLaboral{
	private ArrayList<OfertaLaboral> ofertaLaboral;
	private static ControladorOfertaLaboral instancia;
	// Constructores
		private ControladorOfertaLaboral(){
			this.ofertaLaboral = new ArrayList<OfertaLaboral>();
		}
		public static ControladorOfertaLaboral getInstancia(){
			if (instancia == null)
				instancia = new ControladorOfertaLaboral();
			return instancia;
		}
	// Collections:
		public void crearOfertaLaboral(OfertaLaboralVO vo){
			Empresa empresa = ControladorEmpresa.getInstancia().buscarEmpresa(vo.empresaCuit);//TODO: NO RECONOCE QUE ES EMPRESA FALTA EL IMPORT
			OfertaLaboral oferta = new OfertaLaboral(	
											vo.titulo,
											vo.modalidadContratoFullTime,
											vo.tipoTrabajoRemoto,
											vo.lugarTrabajo,
											vo.categoria,
											vo.sueldoOfrecido,
											vo.fechaVigencia,
											vo.estado,
											vo.medioNotificacion,
											vo.imagen,
											vo.periodoDeCierre,
											empresa
										  );
			this.ofertaLaboral.add(oferta);
			empresa.agregarOferta(oferta);
		}
		protected OfertaLaboral buscarOfertaLaboral(OfertaLaboralVO vo){
			OfertaLaboral resultado;
			for (OfertaLaboral oferta : ofertaLaboral) {
				if (oferta.getCuit() == vo.getTitulo() && oferta.getEmpresa() == vo.getEmpresa()){//TODO:NO EXISTE EN LA OFERTA LABORAL EL CUIT NI EL METODO GET CUIT
					resultado = OfertaLaboral;//TODO: ACA MO DEVOLVERIA OFERTA?
					break;
				}
			}	
			return resultado
		}
		public boolean modificarOfertaLaboral(OfertaLaboralVO vo){
			OfertaLaboral oferta = this.buscarOfertaLaboral(vo);
			if (oferta == null)
				return false;
			oferta.setTitulo(vo.getTitulo());
			oferta.setModalidadContratoFullTime(vo.getModalidadContratoFullTime());
			oferta.setTipoTrabajoRemoto(vo.getTipoTrabajoRemoto());
			oferta.setLugarTrabajo(vo.getLugarTrabajo());
			oferta.setCategoria(vo.getCategoria());
			oferta.setSueldoOfrecido(vo.getSueldoOfrecido());
			oferta.setFechaVigencia(vo.getFechaVigencia());
			oferta.setEstado(vo.getEstado());
			oferta.setMedioNotificacion(vo.getMedioNotificacion());
			oferta.setImagen(vo.getImagen());
			oferta.setPeriodoDeCierre(vo.getPeriodoDeCierre());
			return true;
		}
		public boolean cerrarOfertaLaboral(OfertaLaboralVO vo){
			OfertaLaboral oferta = this.buscarOfertaLaboral(vo);
			if (oferta == null)
				return false;
			oferta.estado.cerrar();//TODO: DICE QUE NO PUEDE VER EL ESTADO IMAGINO QUE PORQUE ES PRIVATE
			return true;
		}
		public boolean reabrirOfertaLaboral(OfertaLaboralVO vo){
			OfertaLaboral oferta = this.buscarOfertaLaboral(vo);
			if (oferta == null)
				return false;
			oferta.estado.abrir();//TODO: DICE QUE NO PUEDE VER EL ESTADO IMAGINO QUE PORQUE ES PRIVATE
			return true;
		}
		public boolean postularse(PostulanteVO postulanteVo, OfertaLaboralVO ofertaVo){
			OfertaLaboral oferta = this.buscarOfertaLaboral(ofertaVo);
			if (oferta == null)
				return false;
			Postulante postulante = ControladorPostulante.getInstancia().buscarPostulante(postulanteVo);
			if (postulante == null)
				return false;
			if (! oferta.controlarRequisitos(postulante))
				return false;
			postulante.agregarPostulacion(oferta);
			oferta.agregarPostulante(postulante);
			return true;
		}
	// Reportes:
		public OfertaLaboral generarReporteMasPostulantes(Date fecha){
			OfertaLaboral masPostulantes;
			for (OfertaLaboral oferta : this.ofertaLaboral) {
				if (oferta.getFechaVigencia() == fecha && oferta.getPostulantes().size() > masPostulantes.size())
					masPostulantes = oferta;
			}
			return oferta;//TODO: ACA NO DEVUELVE MAS POSTULANTES?
		}
		public Dictionary<Categoria, Integer> generarReporteCategorias(){
			Dictionary<Categoria, Integer> dic = new Dictionary<Categoria, Integer>();
			Categoria cat;
			for (OfertaLaboral oferta : this.ofertaLaboral) {
				cat = oferta.getCategoria();
				Integer cant = dic.get(cat);
				cant = cant == null ? oferta.getPostulantes().size() : cant + oferta.getPostulantes().size();
				dic.put(cat, cant);
			}
			return dic;
		}
		public OfertaLaboral generarReporteMasAccesible(){
			// trabajo part-time, remoto, con menor cantidad de tareas asignadas y menor cantidad de requisitos.
			int minTareas = 9999;
			int minRequisitos = 9999;
			OfertaLaboral masAccesible = null;
			for (OfertaLaboral oferta : this.ofertaLaboral) {
				if (!oferta.getModalidadContratoFullTime() && oferta.getTipoTrabajoRemoto()){
					if (oferta.getDescripcionDelPuesto().size() < minTareas){
						if (oferta.getRequisitos().size() < minRequisitos){
							minTareas = oferta.getDescripcionDelPuesto().size();
							minRequisitos = oferta.getRequisitos().size(); 
							masAccesible = oferta;
						}
					}
				}
			}
			return masAccesible; 
		}
		public generarReporteMasExigente(){//TODO: FALTA QUE TIPO VA A DEVOLVER LA FUNCION
			//tiene mayor cantidad de requisitos.
			int maxRequisitos = 0;
			OfertaLaboral masExigente = null;
			for (OfertaLaboral oferta : this.ofertaLaboral) {
				if (oferta.getRequisitos().size() > maxRequisitos){
					maxRequisitos = oferta.getRequisitos().size();
					masExigente = oferta;
				}
			}
			return masExigente;
		}
}
//TODO: ESTE CONTROLADOR Y LA CLASE VO DE OFERTA LABORAL NO ENTIENDEN QUE ES CATEGORIA, IMAGEN, ESTADO, ETC. HAY QUE IMPORTARLO? 
