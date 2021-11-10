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
	private String contrasena;

	// Constructores
		public Postulante(String nombre,String apellido,Date fechaDeNacimiento,Pais nacionalidad,String usuario,String contrasena){
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.nacionalidad = nacionalidad;
			this.usuario = usuario;
			this.contrasena = contrasena;
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

		public void setFechaDeNacimiento(Date fecha){
			this.fechaDeNacimiento = fecha;
		}

		public Pais getNacionalidad(){
			return nacionalidad;
		}

		public void setNacionalidad(Pais nacionalidad){
			this.nacionalidad = nacionalidad;
		}

		public String getContrasena(){
			return contrasena;
		}
		public void setContrasena(String contrasena){
			this.contrasena = contrasena;
		}
		public String getUsuario(){
			return usuario;
		}
		public void setUsuario(String usuario){
			this.usuario = usuario;
		}
		public ArrayList<Categoria> getintereses(){
			return this.intereses;
		}
	// Collections:
		public void agregarIdioma(Idioma idioma){
			this.idiomas.add(idioma);
		}

		public void eliminarIdioma(Idioma idioma){
			this.idiomas.remove(idioma);
		}

		public void agregarInteres(Categoria interes){
			this.intereses.add(interes);
		}

		public void eliminarInteres(Categoria interes){
			this.intereses.remove(interes);
		}

		public void agregarFavorito(OfertaLaboral favorito){
			this.favoritos.add(favorito);
		}

		public void eliminarFavorito(OfertaLaboral favorito){
			this.favoritos.remove(favorito);
		}

		public void agregarPostulacion(OfertaLaboral misPostulaciones){
			this.misPostulaciones.add(misPostulaciones);
		}

		public void eliminarPostulacion(OfertaLaboral misPostulaciones){
			this.misPostulaciones.remove(misPostulaciones);
		}

}