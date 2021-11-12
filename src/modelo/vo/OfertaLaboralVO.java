package modelo.vo;
import java.util.Date;

public class OfertaLaboralVO{
    private String titulo;
    private Boolean modalidadContratoFullTime; 
    private Boolean tipoTrabajoRemoto;
    private Direccion lugarTrabajo;
    private Categoria categoria;
    private Float sueldoOfrecido; 
    private Date fechaVigencia;
    private EstadoOfertaLaboral estado; 
    private Notificador medioNotificacion; 
    private Imagen imagen; 
    private Integer periodoDeCierre;
    private String empresaCuit; //TODO: PORQUE ESTO NO ESTA EN OFERTA LABORAL NORMAL Y EN VO SI O ESTA EN UNO O EN NIGUNO, ADEMAS LA EMORESA NO TIENE CUITT LAS PERSONAS TIENEN CUIT

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public String getEmpresa() {
		return this.empresaCuit;
	}

	public void setEmpresa(String empresaCuit) {
		this.empresaCuit = empresaCuit;
	}
}
//TODO: ESTE CONTROLADOR Y LA CLASE VO DE OFERTA LABORAL NO ENTIENDEN QUE ES CATEGORIA, IMAGEN, ESTADO, NOTIFICADOR, DIRECCION. HAY QUE IMPORTARLO? 
