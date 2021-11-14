package modelo.patrones.moduloImagen;

public class FactoryEstrategiaDeExportacion implements IEstrategiaDeExportacion{
    public IEstrategiaDeExportacion crearEstrategia(Formato formato, String nombreArchivo){
        return null;
    }
    public String exportar(IExportable exp){
        return "";
    }
}