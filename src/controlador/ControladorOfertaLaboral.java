package controlador;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import modelo.dominio.Categoria;
import modelo.dominio.Direccion;
import modelo.dominio.Empresa;
import modelo.dominio.OfertaLaboral;
import modelo.dominio.Pais;
import modelo.dominio.Postulante;
import modelo.vo.OfertaLaboralVO;
import modelo.vo.PostulanteVO;
import modelo.patrones.moduloNotificaciones.Notificacion;
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
			Empresa empresa = ControladorEmpresa.getInstancia().buscarEmpresa(vo.getEmpresaCuit());
			Pais pais = ControladorConfiguracion.getInstancia().buscarPais(vo.getLugarTrabajo().getPais());
			Direccion direccion = new Direccion(vo.getLugarTrabajo().getCodigoPostal(), pais, vo.getLugarTrabajo().getLocalidad(), vo.getLugarTrabajo().getCalle(), vo.getLugarTrabajo().getNumero(), vo.getLugarTrabajo().getPiso());
			OfertaLaboral oferta = new OfertaLaboral(	
											vo.getTitulo(),
											vo.getModalidadContratoFullTime(),
											vo.getTipoTrabajoRemoto(),
											direccion,
											ControladorConfiguracion.getInstancia().buscarCategoria(vo.getCategoriaNombre()),
											vo.getSueldoOfrecido(),
											vo.getFechaVigencia(),
											vo.getPeriodoDeCierre(),
											empresa
										  );
			this.ofertaLaboral.add(oferta);
			empresa.agregarOferta(oferta);
			System.out.println("Oferta " + vo.getTitulo() + " creada");
		}
		protected OfertaLaboral buscarOfertaLaboral(OfertaLaboralVO vo){
			OfertaLaboral resultado = null;
			for (OfertaLaboral oferta : ofertaLaboral) {
				if (oferta.getTitulo() == vo.getTitulo() && oferta.getEmpresa() == ControladorEmpresa.getInstancia().buscarEmpresa(vo.getEmpresaCuit())){
					resultado = oferta;
					break;
				}
			}	
			return resultado;
		}
		public boolean modificarOfertaLaboral(OfertaLaboralVO vo){
			OfertaLaboral oferta = this.buscarOfertaLaboral(vo);
			if (oferta == null)
				return false;
			oferta.setTitulo(vo.getTitulo());
			oferta.setModalidadContratoFullTime(vo.getModalidadContratoFullTime());
			oferta.setTipoTrabajoRemoto(vo.getTipoTrabajoRemoto());
			oferta.setCategoria(ControladorConfiguracion.getInstancia().buscarCategoria(vo.getCategoriaNombre()));
			oferta.setSueldoOfrecido(vo.getSueldoOfrecido());
			oferta.setFechaVigencia(vo.getFechaVigencia());
			oferta.setPeriodoDeCierre(vo.getPeriodoDeCierre());
			return true;
		}
		public boolean cerrarOfertaLaboral(OfertaLaboralVO vo){
			OfertaLaboral oferta = this.buscarOfertaLaboral(vo);
			if (oferta == null){
				System.out.println("No se encontró la oferta");
				return false;
			}
			oferta.getEstado().cerrar(oferta);
			System.out.println("Oferta cerrada exitosamente");
			return true;
		}
		public boolean reabrirOfertaLaboral(OfertaLaboralVO vo){
			OfertaLaboral oferta = this.buscarOfertaLaboral(vo);
			if (oferta == null)
				return false;
			oferta.getEstado().abrir(oferta, 8);
			return true;
		}
		public boolean postularse(PostulanteVO postulanteVo, OfertaLaboralVO ofertaVo){
			OfertaLaboral oferta = this.buscarOfertaLaboral(ofertaVo);
			if (oferta == null){
				System.out.println("No se encuentra la oferta");
				return false;
			}
			Postulante postulante = ControladorPostulante.getInstancia().buscarPostulante(postulanteVo);
			if (postulante == null){
				System.out.println("No se encuentra el postulante");
				return false;
			}
			if (! oferta.controlarRequisitos(postulante)){
				System.out.println("El postulante no cumple los requisitos");
				return false;
			}
			postulante.agregarPostulacion(oferta);
			oferta.agregarPostulante(postulante);
			//Envío de notificación
			String mensaje = "El postulante "+ postulanteVo.getNombre() + " se postuló a la oferta " + oferta.getTitulo();
			Notificacion notif = new Notificacion (oferta.getEmpresa().getCorreo(), mensaje);
			oferta.getMedioNotificacion().enviar(notif);
			System.out.println(mensaje);
			return true;
		}
	// Reportes:
		public OfertaLaboral generarReporteMasPostulantes(Date fecha){
			OfertaLaboral masPostulantes = null;
			for (OfertaLaboral oferta : this.ofertaLaboral) {
				if (masPostulantes == null || (oferta.getFechaVigencia() == fecha && oferta.getPostulantes().size() > masPostulantes.getPostulantes().size()))
					masPostulantes = oferta;
			}
			return masPostulantes;
		}
		public HashMap<Categoria, Integer> generarReporteCategorias(){
			HashMap<Categoria, Integer> dic = new HashMap<Categoria, Integer>();
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
		public OfertaLaboral generarReporteMasExigente(){
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