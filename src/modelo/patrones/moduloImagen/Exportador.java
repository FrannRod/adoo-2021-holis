package modelo.patrones.moduloImagen;

public class Exportador {
    IExportable imagenAExportar; 
    IEstrategiaDeExportacion estrategia; 

    public Exportador(IExportable imagenAExportar,IEstrategiaDeExportacion estrategia){
        this.imagenAExportar = imagenAExportar;
        this.estrategia = estrategia;
    }

    public String exportar(){
        return estrategia.exportar(imagenAExportar);
    }

    public void cambiarEstrategia(IEstrategiaDeExportacion exp){
        this.estrategia = exp;
    }
}