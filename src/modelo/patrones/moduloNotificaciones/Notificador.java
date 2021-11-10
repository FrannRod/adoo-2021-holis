package modelo.patrones.moduloNotificaciones;

import modelo.patrones.moduloNotificaciones.estrategias.EstrategiaDeNotificacion;

public class Notificador {
	private EstrategiaDeNotificacion estrategia;
	
	public void enviar(Notificacion notificacion) {
		this.estrategia.enviar(notificacion);
	}
	
	public void setEstrategia(EstrategiaDeNotificacion estrategia) {
		this.estrategia = estrategia;
	}
}
