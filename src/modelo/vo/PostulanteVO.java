package modelo.vo;
import java.util.Date;
public class PostulanteVO{

	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private String nacionalidadVO;
	private String usuario;
	private String contrasena;

	// Constructores
		public PostulanteVO(String nombre,String apellido,Date fechaDeNacimiento,Pais nacionalidadVO,String usuario,String contrasena){
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.nacionalidadVO = nacionalidadVO;
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
			return nacionalidadVO;
		}

		public void setNacionalidad(Pais nacionalidadVO){
			this.nacionalidadVO = nacionalidadVO;
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