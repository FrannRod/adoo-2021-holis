package modelo.dominio.moduloOfertaLab;

public interface EstadoOfertaLaboral{

    private Estado estado;

    public boolean abrir(OfertaLaboral oferta, int nSemanas){
        this.estado = new Abierto(oferta, nSemanas);
    }

    public boolean cerrar(OfertaLaboral oferta){
        this.estado = new Cerrado(oferta);
    }
}