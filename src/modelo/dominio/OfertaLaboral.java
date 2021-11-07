package modelo.dominio;

public class OfertaLaboral{
    private String titulo;
    private List<Postulante> postulantes;
    private List<Tarea> descripcionDelPuesto;
    private Boolean modalidadContratoFullTime; 
    private Boolean tipoTrabajoRemoto;
    private Direccion lugarTrabajo;
    private Categoria categoria;
    private List<Requisito> requisitos;
    private Float sueldoOfrecido; 
    private Date fechaVigencia;
    private EstadoOfertaLaboral estado; 
    private Notificador medioNotificacion; 
    private Imagen imagen; 
    private Integer periodoDeCierre;
    private Empresa empresa; 

}

