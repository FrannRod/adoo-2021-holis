package modelo.patrones.moduloEstadoOfertaLab;
import java.util.Date;
import modelo.dominio.OfertaLaboral;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Cerrado implements EstadoOfertaLaboral{

    public boolean cerrar(OfertaLaboral oferta){
        return true;
    }

    private Date sumarFecha(int dias){
        String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        DateTimeFormatter dateFormat8 = DateTimeFormatter.ofPattern(DATE_FORMAT);

        // Get current date
        Date currentDate = new Date();
        System.out.println("date : " + dateFormat.format(currentDate));

        // convert date to localdatetime
        LocalDateTime localDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime : " + dateFormat8.format(localDateTime));

        // plus one
        localDateTime = localDateTime.plusDays(dias);

        // convert LocalDateTime to date
        Date currentDatePlusOneDay = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println("\nOutput : " + dateFormat.format(currentDatePlusOneDay));

        return currentDatePlusOneDay; 
    }

    public boolean abrir(OfertaLaboral oferta, int nSemanas){
        // ver que no hayan pasado más de n días 
        Date fechaVigencia = oferta.getFechaVigencia();
        int dias = nSemanas*7; 
        //fechaVigencia + n < fechaActual
        if ( fechaVigencia.after(sumarFecha(dias)) ){
            oferta.setEstado(new Abierto());
            return true;
        }else
            return false;
    }
}