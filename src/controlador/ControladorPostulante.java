package controlador;
import modelo.dominio.Postulante;
import modelo.vo.PostulanteVO;
import modelo.dominio.Categoria;
import java.util.ArrayList;
public class ControladorPostulante{
	private ArrayList<Postulante> postulantes;
	private static ControladorPostulante instancia;
	// Constructores
		private ControladorPostulante(){
			this.postulantes = new ArrayList<Postulante>();
		}
		public static ControladorPostulante getInstancia(){
			if (instancia == null)
				instancia = new ControladorPostulante();
			return instancia;
		}
	// Collections:
		public void agregarPostulante(PostulanteVO vo){
			Postulante postulante = new Postulante( vo.getNombre(),
											vo.getApellido(),
											vo.getFechaDeNacimiento(),
											ControladorConfiguracion.getInstancia().buscarPais(vo.getNacionalidad()),
											vo.getUsuario(),
											vo.getContrasena()
										  );
			this.postulantes.add(postulante);
		}
		protected Postulante buscarPostulante(PostulanteVO vo){
			Postulante resultado;
			for (Postulante postulante : postulantes) {
				if (postulante.getNombre() == vo.getNombre() && postulante.getApellido() == vo.getApellido()){
					resultado = postulante;
					break;
				}
			}
			return resultado;
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
			postulante.setNombre(vo.getNombre());
			postulante.setApellido(vo.getApellido());
			postulante.setFechaDeNacimiento(vo.getFechaDeNacimiento());
			postulante.setNacionalidad(ControladorConfiguracion.getInstancia().buscarPais(vo.getNacionalidad()));
			postulante.setUsuario(vo.getUsuario());
			postulante.setContrasena(vo.getContrasena());
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