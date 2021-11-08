package modelo.dominio.moduloOfertaLab;

public interface EstadoOfertaLaboral{

    private Estado estado;

    public boolean abrir(Empresa empresa, OfertaLaboral oferta){
        this.estado = new Abierto(empresa, oferta);
    }

    public boolean cerrar(Empresa empresa, OfertaLaboral oferta){
        this.estado = new Cerrado(empresa, oferta);
    }
}