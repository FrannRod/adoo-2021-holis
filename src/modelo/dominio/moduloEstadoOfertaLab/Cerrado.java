package modelo.dominio.moduloOfertaLab;

public class Cerrado{

    public boolean cerrar(Empresa empresa, OfertaLaboral oferta){
        OfertaLaboral.setEstado = Cerrado; 
        // acá no sé cómo preguntarle si quiere reabrir
    }

    public boolean abrir(Empresa empresa, OfertaLaboral oferta){
        EstadoOfertaLaboral.abrir(empresa, oferta);
    }
}