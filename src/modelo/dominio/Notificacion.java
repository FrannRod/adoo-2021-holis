package modelo.dominio;
public class Notificacion{
	private String emailDestinatario;
	private String emailRemitente;
	private String mensaje;
	private String asunto;
	// Constructores
		public Notificacion(String emailDestinatario, String emailRemitente, String mensaje, String asunto){
			this.emailDestinatario = emailDestinatario;
			this.emailRemitente = emailRemitente;
			this.mensaje = mensaje;
			this.asunto = asunto;
		}
	// Getters y Setters
		public void setEmailDestinatario(String emailDestinatario){
			this.emailDestinatario = emailDestinatario;
		}
		public String getEmailDestinatario(){
			return this.emailDestinatario;
		}

		public void setEmailRemitente(String emailRemitente){
			this.emailRemitente = emailRemitente;
		}
		public String getEmailRemitente(){
			return this.emailRemitente;
		}

		public void setMensaje(String mensaje){
			this.mensaje = mensaje;
		}
		public String getMensaje(){
			return this.mensaje;
		}

		public void setAsunto(String asunto){
			this.asunto = asunto;
		}
		public String getAsunto(){
			return this.asunto;
		}
	// Otros métodos
}