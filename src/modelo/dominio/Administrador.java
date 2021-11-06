package modelo.dominio;
public class Administrador{

	private String nombre;
	private String apellido;
	private String correo;
	private String contraseña;

	// Constructores:
		public Administrador(String nombre, String apellido, String correo, String contraseña){
			this.nombre = nombre;
			this.apellido = apellido;
			this.correo = correo;
			this.contraseña = contraseña;

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

		public void setContraseña(String contraseña){
			this.contraseña = contraseña;
		}
		public String getContraseña(){
			return this.contraseña;
		}
}