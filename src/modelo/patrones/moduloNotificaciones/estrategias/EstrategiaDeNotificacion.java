package modelo.patrones.moduloNotificaciones.estrategias;

import modelo.dominio.Notificacion;

public interface EstrategiaDeNotificacion {
	public void enviar(Notificacion notificacion);
}
