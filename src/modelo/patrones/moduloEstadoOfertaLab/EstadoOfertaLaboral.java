package modelo.patrones.moduloEstadoOfertaLab;
import modelo.dominio.OfertaLaboral;

public interface EstadoOfertaLaboral{

    // private Estado estado;

    public boolean abrir(OfertaLaboral oferta, int nSemanas);

    public boolean cerrar(OfertaLaboral oferta);
}