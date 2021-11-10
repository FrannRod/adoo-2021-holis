package modelo.patrones.moduloNotificaciones.estrategias;

import modelo.patrones.moduloNotificaciones.Notificacion;

public interface EstrategiaDeNotificacion {
	public void enviar(Notificacion notificacion);
}
