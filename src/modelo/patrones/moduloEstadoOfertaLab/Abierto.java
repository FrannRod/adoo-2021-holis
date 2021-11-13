package modelo.patrones.moduloEstadoOfertaLab;
import modelo.dominio.OfertaLaboral;


public class Abierto implements EstadoOfertaLaboral{
    public boolean abrir(OfertaLaboral oferta, int nSemanas){
        return true;        
    }

    public boolean cerrar(OfertaLaboral oferta){
        EstadoOfertaLaboral estado = new Cerrado();
        oferta.setEstado(estado);
        return true;
    }
}
