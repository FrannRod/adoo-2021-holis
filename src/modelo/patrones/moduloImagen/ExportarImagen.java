package modelo.patrones.moduloImagen;

public class ExportarImagen implements IEstrategiaDeExportacion{
    public String exportar(IExportable exp){
        Imagen imagen = exp.crearImagen(Formato.PNG);
        System.out.println("Se ha generado la imagen con encabezado:"+ imagen.getEncabezado()+"cuerpo:"+imagen.getCuerpo()+ "pie:"+imagen.getPie());
        return "path";
    }
    
}