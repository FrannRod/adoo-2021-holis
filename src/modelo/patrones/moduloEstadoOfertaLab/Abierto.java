package modelo.patrones.moduloEstadoOfertaLab;
import modelo.dominio.OfertaLaboral;


public class Abierto implements EstadoOfertaLaboral{
    public boolean abrir(OfertaLaboral oferta, int nSemanas){        
    }

    public boolean cerrar(OfertaLaboral oferta){
        oferta.estado = new Cerrado();//TODO: NO PODES ACCEDER AL ESTADO ES PRIVADO
    }
}
