package modelo.dominio;
import java.util.ArrayList;
import java.util.Date;
import modelo.patrones.moduloEstadoOfertaLab.Abierto;
import modelo.patrones.moduloEstadoOfertaLab.EstadoOfertaLaboral;
import modelo.patrones.moduloImagen.Formato;
import modelo.patrones.moduloImagen.Imagen;
import modelo.patrones.moduloNotificaciones.Notificador;
public class OfertaLaboral{
    private String titulo;
    private ArrayList<Postulante> postulantes;
    private ArrayList<Tarea> descripcionDelPuesto;
    private Boolean modalidadContratoFullTime; 
    private Boolean tipoTrabajoRemoto;
    private Direccion lugarTrabajo;
    private Categoria categoria;
    private ArrayList<Requisito> requisitos;
    private Float sueldoOfrecido; 
    private Date fechaVigencia;
    private EstadoOfertaLaboral estado; 
    private Notificador medioNotificacion; 
    private Imagen imagen; 
    private Integer periodoDeCierre;
    private Empresa empresa; 

	public OfertaLaboral(String titulo, Boolean	modalidadContratoFullTime, Boolean tipoTrabajoRemoto, Direccion direccion, Categoria categoria, Float sueldoOfrecido, Date fechaVigencia, Integer periodoDeCierre,	Empresa empresa){
		this.titulo = titulo;
		this.modalidadContratoFullTime = modalidadContratoFullTime;
		this.tipoTrabajoRemoto = tipoTrabajoRemoto;
		this.lugarTrabajo = direccion;
		this.categoria = categoria;
		this.sueldoOfrecido = sueldoOfrecido;
		this.fechaVigencia = fechaVigencia;
		this.periodoDeCierre = periodoDeCierre;
		this.empresa = empresa;
		this.estado = new Abierto(); 
		this.medioNotificacion = new Notificador();

		this.postulantes = new ArrayList<Postulante>();
		this.descripcionDelPuesto = new ArrayList<Tarea>();
		this.requisitos = new ArrayList<Requisito>();
	}
	

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Postulante> getPostulantes() {
		return this.postulantes;
	}

	public void agregarPostulante(Postulante postulante){
		this.postulantes.add(postulante);
	}

	public void eliminarPostulante(Postulante postulante){
		this.postulantes.remove(postulante);
	}

	public ArrayList<Tarea> getDescripcionDelPuesto() {
		return this.descripcionDelPuesto;
	}

	public void setDescripcionDelPuesto(ArrayList<Tarea> descripcionDelPuesto) {
		this.descripcionDelPuesto = descripcionDelPuesto;
	}

	public Boolean getModalidadContratoFullTime() {
		return this.modalidadContratoFullTime;
	}

	public void setModalidadContratoFullTime(Boolean modalidadContratoFullTime) {
		this.modalidadContratoFullTime = modalidadContratoFullTime;
	}

	public Boolean getTipoTrabajoRemoto() {
		return this.tipoTrabajoRemoto;
	}

	public void setTipoTrabajoRemoto(Boolean tipoTrabajoRemoto) {
		this.tipoTrabajoRemoto = tipoTrabajoRemoto;
	}

	public Direccion getLugarTrabajo() {
		return this.lugarTrabajo;
	}

	public void setLugarTrabajo(Direccion lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Requisito> getRequisitos() {
		return this.requisitos;
	}

	public void setRequisitos(ArrayList<Requisito> requisitos) {
		this.requisitos = requisitos;
	}

	public Float getSueldoOfrecido() {
		return this.sueldoOfrecido;
	}

	public void setSueldoOfrecido(Float sueldoOfrecido) {
		this.sueldoOfrecido = sueldoOfrecido;
	}

	public Date getFechaVigencia() {
		return this.fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public EstadoOfertaLaboral getEstado() {
		return this.estado;
	}

	public void setEstado(EstadoOfertaLaboral estado) {
		this.estado = estado;
	}

	public Notificador getMedioNotificacion() {
		return this.medioNotificacion;
	}

	public void setMedioNotificacion(Notificador medioNotificacion) {
		this.medioNotificacion = medioNotificacion;
	}

	public Imagen getImagen() {
		return this.imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public Integer getPeriodoDeCierre() {
		return this.periodoDeCierre;
	}

	public void setPeriodoDeCierre(Integer periodoDeCierre) {
		this.periodoDeCierre = periodoDeCierre;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

    public void generarTitulo (){
		this.titulo = categoria+" en "+lugarTrabajo;
    }

	public void crearImagen(Formato formato){
		this.imagen = new Imagen().generarImagen(this, formato);
	}

	public boolean controlarRequisitos(Postulante postulante){
		ArrayList<Categoria> intereses= postulante.getintereses();
		boolean cumple=false;
		for (Categoria interes : intereses) {
			if(interes==this.categoria){
				cumple=true;
				break;
			}
		}
		return cumple;
	}
}