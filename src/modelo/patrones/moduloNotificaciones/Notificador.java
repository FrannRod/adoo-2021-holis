package modelo.patrones.moduloNotificaciones;
import modelo.patrones.moduloNotificaciones.estrategias.EstrategiaDeNotificacion;
import modelo.patrones.moduloNotificaciones.estrategias.NotificacionPorEmail;

public class Notificador {
	private EstrategiaDeNotificacion estrategia;
	
	public Notificador (){
		this.estrategia = new NotificacionPorEmail();
	}

	public void enviar(Notificacion notificacion) {
		this.estrategia.enviar(notificacion);
	}
	
	public void setEstrategia(EstrategiaDeNotificacion estrategia) {
		this.estrategia = estrategia;
	}
}
