package controlador;
import modelo.dominio.Postulante;
import modelo.vo.PostulanteVO;
import modelo.dominio.Categoria;
import java.util.List;
public class ControladorPostulante{
	private List<Postulante> postulantes;
	private static ControladorPostulante instancia;
	// Constructores
		private ControladorPostulante(){
			this.postulantes = new List<Postulante>();
		}
		public ControladorPostulante getInstancia(){
			if (this.instancia == null)
				this.instancia = new ControladorPostulante();
			return instancia;
		}
	// Collections:
		public void agregarPostulante(PostulanteVO vo){
			Postulante postulante = new Postulante( vo.nombre,
											vo.apellido,
											vo.fechaDeNacimiento,
											vo.nacionalidad,
											vo.usuario,
											vo.contraseña
										  );
			this.postulantes.add(postulante);
		}
		protected Postulante buscarPostulante(PostulanteVO vo){
			Postulante resultado;
			for (Postulante postulante : postulantes) {
				if (Postulante.getNombre() == vo.getNombre() && Postulante.getApellido() == vo.getApellido()){
					resultado = postulante;
					break;
				}
			}
			return resultado
		}
		public void eliminarPostulante(PostulanteVO vo){
			Postulante elemento = this.buscarPostulante(vo);
			if (elemento != null)
				this.postulantes.remove(elemento);
		}
		public boolean modificarPostulante(PostulanteVO vo){
			Postulante postulante = this.buscarPostulante(vo);
			if (postulante == null)
				return false;
			postulante.setNombre(vo.nombre);
			postulante.setApellido(vo.apellido);
			postulante.setFechaDeNacimiento(vo.fechaDeNacimiento);
			postulante.setNacionalidad(vo.nacionalidad);
			postulante.setUsuario(vo.usuario);
			postulante.setContraseña(vo.contraseña);
			return true;
		}

		public boolean agregarInteres(PostulanteVO vo, String categoria){
			Postulante postulante = this.buscarPostulante(vo);
			if (postulante == null)
				return false;
			Categoria cat = ControladorConfiguracion.getInstancia().buscarCategoria(categoria);
			if (cat == null)
				return false;
			postulante.agregarInteres(cat);
			return true;
		}
}