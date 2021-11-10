package modelo.patrones.moduloImagen;

public class Exportador {
    IExportable imagenAExportar; 
    IEstrategiaDeExportacion estrategia; 

    public String exportar(){}

    public void cambiarEstrategia(IEstrategiaDeExportacion){}
}