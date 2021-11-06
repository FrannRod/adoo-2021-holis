package modelo.dominio;
public class Postulante{

	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private Pais nacionalidad;
	private List<Idioma> idiomas;
	private List<Categoria> intereses;
	private List<OfertaLaboral> favoritos;
	private List<OfertaLaboral> misPostulaciones;
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
			this.idiomas = new List<Idioma>()
			this.intereses = new List<Categoria>()
			this.favoritos = new List<OfertaLaboral>()
			this.misPostulaciones = new List<OfertaLaboral>()
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
			this.Idiomas.add(idioma);
		}

		public void eliminarIdioma(Idioma idiomas){
			this.Idiomas.remove(idioma);
		}

		public void agregarIntereses(Categoria intereses){
			this.Categoria.add(intereses);
		}

		public void eliminarIntereses(Categoria intereses){
			this.Categoria.remove(intereses);
		}

		public void agregarFavoritos(OfertaLaboral favoritos){
			this.OfertaLaboral.add(favoritos);
		}

		public void eliminarFavoritos(OfertaLaboral favoritos){
			this.OfertaLaboral.remove(favoritos);
		}

		public void agregarMisPostulaciones(OfertaLaboral misPostulaciones){
			this.OfertaLaboral.add(misPostulaciones);
		}

		public void eliminarMisPostulaciones(OfertaLaboral misPostulaciones){
			this.OfertaLaboral.remove(misPostulaciones);
		}

}