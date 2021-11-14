package modelo.patrones.moduloNotificaciones.estrategias.adapters.email;

import modelo.patrones.moduloNotificaciones.Notificacion;

public class AdapterEmailJavaEmail implements AdapterNotificadorEmail {

	/**
	 * TODO Se debería llamas a la o las clases correspondientes que se 
	 * quieren adaptar
	 */
	public void enviarEmail(Notificacion notificacion) {
		System.out.println("Enviando Email a " +
				notificacion.getEmailDestinatario() +
				"'" + notificacion.getMensaje() + "'"
				);

	}

}
