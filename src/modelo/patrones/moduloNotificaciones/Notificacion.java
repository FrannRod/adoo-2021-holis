package modelo.patrones.moduloNotificaciones;

public class Notificacion {
	private String emailDestinatario;
	private String emailRemitente;
	private String mensaje;

	public Notificacion(String emailDestinatario, String mensaje){
		this.emailDestinatario = emailDestinatario;
		this.emailRemitente = "nosotros@mail.com";
		this.mensaje = mensaje; 
	}

	public String getEmailDestinatario() {
		return emailDestinatario;
	}
	public void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}
	public String getEmailRemitente() {
		return emailRemitente;
	}
	public void setEmailRemitente(String emailRemitente) {
		this.emailRemitente = emailRemitente;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}

