package controlador;
import modelo.dominio.OfertaLaboral;
import modelo.dominio.Postulante;
import modelo.dominio.Categoria;
import modelo.vo.OfertaLaboralVO;
import modelo.vo.PostulanteVO;
import java.util.List;
import java.util.Dictionary;
public class ControladorOfertaLaboral{
	private List<OfertaLaboral> ofertaLaboral;
	private static ControladorOfertaLaboral instancia;
	// Constructores
		private ControladorOfertaLaboral(){
			this.ofertaLaboral = new List<OfertaLaboral>();
		}
		public ControladorOfertaLaboral getInstancia(){
			if (this.instancia == null)
				this.instancia = new ControladorOfertaLaboral();
			return instancia;
		}
	// Collections:
		public void crearOfertaLaboral(OfertaLaboralVO vo){
			Empresa empresa = ControladorEmpresa.getInstancia().buscarEmpresa(vo.empresaCuit);
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
				if (oferta.getCuit() == vo.getTitulo() && oferta.getEmpresa() == vo.getEmpresa()){
					resultado = OfertaLaboral;
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
			oferta.estado.cerrar();
			return true;
		}
		public boolean reabrirOfertaLaboral(OfertaLaboralVO vo){
			OfertaLaboral oferta = this.buscarOfertaLaboral(vo);
			if (oferta == null)
				return false;
			oferta.estado.abrir();
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
			return oferta;
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
		public generarReporteMasAccesible(){}
		public generarReporteMasExigente(){}
}