package modelo.patrones.moduloImagen;

public class Exportador {
    IExportable imagenAExportar; 
    IEstrategiaDeExportacion estrategia; 

    public String exportar(){
        return "";
    }

    public void cambiarEstrategia(IEstrategiaDeExportacion exp){
    }
}