package modelo.vo;
import java.util.Date;
public class PostulanteVO{

	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private Pais nacionalidad;
	private String usuario;
	private String contrasena;

	// Constructores
		public PostulanteVO(String nombre,String apellido,Date fechaDeNacimiento,Pais nacionalidad,String usuario,String contrasena){
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.nacionalidad = nacionalidad;
			this.usuario = usuario;
			this.contrasena = contrasena;
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
}
//TODO: COMO EN OFERTA LABORAL VO ESTA CLASE VO TAMPOCO ENTIENDE QUE ES PAIS, HAY QUE IMPORTARLO?
