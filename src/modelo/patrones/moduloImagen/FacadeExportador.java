package modelo.patrones.moduloImagen;

public class FacadeExportador {
    public String exportar(IExportable imagen, String nombre){
        IEstrategiaDeExportacion estrategia = new FactoryEstrategiaDeExportacion().crearEstrategia(Formato.PNG, nombre);
        Exportador exportador = new Exportador(imagen, estrategia);
        return exportador.exportar();
    }
}