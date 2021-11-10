package modelo.dominio;
import java.util.Date;
import java.util.ArrayList;
public class Postulante{

	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private Pais nacionalidad;
	private ArrayList<Idioma> idiomas;
	private ArrayList<Categoria> intereses;
	private ArrayList<OfertaLaboral> favoritos;
	private ArrayList<OfertaLaboral> misPostulaciones;
	private String usuario;
	private String contraseña;

	// Constructores
		public Postulante(String nombre,String apellido,Date fechaDeNacimiento,Pais nacionalidad,String usuario,String contraseña){
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.nacionalidad = nacionalidad;
			this.usuario = usuario;
			this.contraseña = contraseña;
			this.idiomas = new ArrayList<Idioma>();
			this.intereses = new ArrayList<Categoria>();
			this.favoritos = new ArrayList<OfertaLaboral>();
			this.misPostulaciones = new ArrayList<OfertaLaboral>();
		}

	// Setters y Getters:
		public String getNombre(){
			return nombre;
		}

		public void setNombre(String nombre){
			this.nombre = nombre;
		}

		public String getApellido(){
			return apellido;
		}

		public void setApellido(String apellido){
			this.apellido = apellido;
		}

		public Date getFechaDeNacimiento(){
			return fechaDeNacimiento;
		}

		public void setFechaDeNacimiento(){
			this.fechaDeNacimiento = fechaDeNacimiento;
		}

		public Pais getNacionalidad(){
			return nacionalidad;
		}

		public void setNacionalidad(Pais nacionalidad){
			this.nacionalidad = nacionalidad;
		}

		public String getContraseña(){
			return contraseña;
		}
		public void setContraseña(String contraseña){
			this.contraseña = contraseña;
		}
		public String getUsuario(){
			return usuario;
		}
		public void setUsuario(String usuario){
			this.usuario = usuario;
		}
	// Collections:
		public void agregarIdioma(Idioma idiomas){
			this.idiomas.add(idioma);
		}

		public void eliminarIdioma(Idioma idiomas){
			this.idiomas.remove(idioma);
		}

		public void agregarInteres(Categoria intereses){
			this.categoria.add(intereses);
		}

		public void eliminarInteres(Categoria intereses){
			this.categoria.remove(intereses);
		}

		public void agregarFavorito(OfertaLaboral favoritos){
			this.ofertaLaboral.add(favoritos);
		}

		public void eliminarFavorito(OfertaLaboral favoritos){
			this.ofertaLaboral.remove(favoritos);
		}

		public void agregarPostulacion(OfertaLaboral misPostulaciones){
			this.ofertaLaboral.add(misPostulaciones);
		}

		public void eliminarPostulacion(OfertaLaboral misPostulaciones){
			this.ofertaLaboral.remove(misPostulaciones);
		}

}