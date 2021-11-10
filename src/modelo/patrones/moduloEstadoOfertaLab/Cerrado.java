package modelo.patrones.moduloOfertaLab;
import java.utils.Date;

public class Cerrado implements EstadoOfertaLaboral{

    public boolean cerrar(OfertaLaboral oferta){
    }

    public boolean abrir(OfertaLaboral oferta, int nSemanas){
        // ver que no hayan pasado más de n días 
        Date fechaVigencia = OfertaLaboral.getFechaVigencia() + nSemanas*7; 
        Date fechaActual = new Date();  
        //fechaVigencia + n < fechaActual
        if ( fechaVigencia.after(fechaActual) ){
            oferta.estado = new Abierto();
        }
    }
}