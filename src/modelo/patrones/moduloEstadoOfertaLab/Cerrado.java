package modelo.patrones.moduloEstadoOfertaLab;
import java.util.Date;
import modelo.dominio.OfertaLaboral;

public class Cerrado implements EstadoOfertaLaboral{

    public boolean cerrar(OfertaLaboral oferta){
    }

    public boolean abrir(OfertaLaboral oferta, int nSemanas){
        // ver que no hayan pasado más de n días 
        Date fechaVigencia = oferta.getFechaVigencia() + nSemanas*7;
        Date fechaActual = new Date();  
        //fechaVigencia + n < fechaActual
        if ( fechaVigencia.after(fechaActual) ){
            oferta.setEstado(new Abierto());
            return true;
        }else
            return false;
    }
}