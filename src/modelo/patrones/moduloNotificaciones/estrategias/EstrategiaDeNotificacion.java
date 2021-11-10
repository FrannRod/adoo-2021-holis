package modelo.patrones.moduloNotificaciones.estrategias;

import moduloNotificaciones.Notificacion;

public interface EstrategiaDeNotificacion {
	public void enviar(Notificacion notificacion);
}
