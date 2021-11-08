package modelo.dominio.moduloOfertaLab;

public class Abierto{
    public boolean abrir(Empresa empresa, OfertaLaboral oferta){
        OfertaLaboral.setEstado = Abierto; 
        Date fechaVigencia = OfertaLaboral.getFechaVigencia(); 
        Date fechaActual = new Date();  
        if ( fechaVigencia.after(fechaActual) ){
            EstadoOfertaLaboral.cerrar(empresa, oferta);
        }
    }

    public boolean cerrar(Empresa empresa, OfertaLaboral oferta){
        EstadoOfertaLaboral.cerrar(empresa, oferta);
    }
}
