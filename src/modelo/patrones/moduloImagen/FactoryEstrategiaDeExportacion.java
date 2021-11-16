package modelo.patrones.moduloImagen;

public class FactoryEstrategiaDeExportacion {
    public IEstrategiaDeExportacion crearEstrategia(Formato formato, String nombreArchivo){
        return new ExportarImagen();
    }
}