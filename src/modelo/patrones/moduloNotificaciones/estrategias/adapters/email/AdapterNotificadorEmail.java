package modelo.patrones.moduloNotificaciones.estrategias.adapters.email;

import modelo.patrones.moduloNotificaciones.Notificacion;

public interface AdapterNotificadorEmail {
	void enviarEmail(Notificacion notificacion);

}
