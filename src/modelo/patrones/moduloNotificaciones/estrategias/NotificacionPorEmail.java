package modelo.patrones.moduloNotificaciones.estrategias;

import modelo.patrones.moduloNotificaciones.Notificacion;
import modelo.patrones.moduloNotificaciones.estrategias.adapters.email.AdapterNotificadorEmail;
import modelo.patrones.moduloNotificaciones.estrategias.adapters.email.AdapterEmailJavaEmail;

public class NotificacionPorEmail implements EstrategiaDeNotificacion {

	private AdapterNotificadorEmail adapter;

	public NotificacionPorEmail(){
		//this.super(); 
		this.adapter = new AdapterEmailJavaEmail();
	}
	
	public void setAdapter(AdapterNotificadorEmail adapter) {
		this.adapter = adapter;
	}

	public NotificacionPorEmail(AdapterNotificadorEmail adapter) {
		super();
		this.adapter = adapter;
	}

	public void enviar(Notificacion notificacion) {
		this.adapter.enviarEmail(notificacion);
		System.out.println("Email enviado a " + notificacion.getEmailDestinatario());
	}

}
