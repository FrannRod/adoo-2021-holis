package modelo.dominio;
public class Administrador{

	private String nombre;
	private String apellido;
	private String correo;
	private String contrasena;

	// Constructores:
		public Administrador(String nombre, String apellido, String correo, String contrasena){
			this.nombre = nombre;
			this.apellido = apellido;
			this.correo = correo;
			this.contrasena = contrasena;
		}
		
	// Setters y Getters:
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public String getNombre(){
			return this.nombre;
		}

		public void setApellido(String apellido){
			this.apellido = apellido;
		}
		public String getApellido(){
			return this.apellido;
		}

		public void setCorreo(String correo){
			this.correo = correo;
		}
		public String getNombre(){
			return this.correo;
		}

		public void setContrasena(String contrasena){
			this.contrasena = contrasena;
		}
		public String getContrasena(){
			return this.contrasena;
		}
}