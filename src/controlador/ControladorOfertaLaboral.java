package controlador;
import modelo.dominio.OfertaLaboral;
import modelo.dominio.Postulante;
import modelo.vo.OfertaLaboralVO;
import modelo.vo.PostulanteVO;
import java.util.List;
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
		public generarReporteMasPostulantes(Date fecha){}
		public generarReporteCategorias(){}
		public generarReporteMasAccesible(){}
		public generarReporteMasExigente(){}
}