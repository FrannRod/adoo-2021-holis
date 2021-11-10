package modelo.patrones.moduloEstadoOfertaLab;

public interface EstadoOfertaLaboral{

    // private Estado estado;

    public boolean abrir(OfertaLaboral oferta, int nSemanas);

    public boolean cerrar(OfertaLaboral oferta);
}