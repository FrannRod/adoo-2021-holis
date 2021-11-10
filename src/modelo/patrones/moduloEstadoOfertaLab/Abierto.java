package modelo.patrones.moduloOfertaLab;


public class Abierto implements EstadoOfertaLaboral{
    public boolean abrir(OfertaLaboral oferta, int nSemanas){        
    }

    public boolean cerrar(OfertaLaboral oferta){
        oferta.estado = new Cerrado();
    }
}
