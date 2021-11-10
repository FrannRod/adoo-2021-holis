package modelo.patrones.moduloEstadoOfertaLab;
import java.util.Date;
import modelo.dominio.OfertaLaboral;

public class Cerrado implements EstadoOfertaLaboral{

    public boolean cerrar(OfertaLaboral oferta){
    }

    public boolean abrir(OfertaLaboral oferta, int nSemanas){
        // ver que no hayan pasado más de n días 
        Date fechaVigencia = OfertaLaboral.getFechaVigencia() + nSemanas*7; //TODO: ACA NO SERIA OFERTA EN LUGAR DE OFERTA LABORAL
        Date fechaActual = new Date();  
        //fechaVigencia + n < fechaActual
        if ( fechaVigencia.after(fechaActual) ){
            oferta.estado = new Abierto();//TODO: EL ESTADO ES PRIVADO NO LO PODES ACCEDER
        }
    }
}