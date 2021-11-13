package modelo.vo;
import java.util.Date;

public class OfertaLaboralVO{
    private String titulo;
    private Boolean modalidadContratoFullTime; 
    private Boolean tipoTrabajoRemoto;
    private DireccionVO lugarTrabajo;
    private String categoriaNombre;
    private Float sueldoOfrecido; 
    private Date fechaVigencia;
    private Integer periodoDeCierre;
    private int empresaCuit;

    public OfertaLaboralVO(String titulo, Boolean modalidadContratoFullTime, Boolean tipoTrabajoRemoto, DireccionVO lugarTrabajo, String categoriaNombre, Float sueldoOfrecido, Date fechaVigencia, Integer periodoDeCierre, int empresaCuit){
    	this.titulo = titulo;
    	this.modalidadContratoFullTime = modalidadContratoFullTime;
    	this.tipoTrabajoRemoto = tipoTrabajoRemoto;
    	this.lugarTrabajo = lugarTrabajo;
    	this.categoriaNombre = categoriaNombre;
    	this.sueldoOfrecido = sueldoOfrecido;
    	this.fechaVigencia = fechaVigencia;
    	this.periodoDeCierre = periodoDeCierre;
    	this.empresaCuit = empresaCuit;
    }

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

	public DireccionVO getLugarTrabajo() {
		return this.lugarTrabajo;
	}

	public void setLugarTrabajo(DireccionVO lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	public String getCategoriaNombre() {
		return this.categoriaNombre;
	}

	public void setCategoriaNombre(String categoriaNombre) {
		this.categoriaNombre = categoriaNombre;
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

	public Integer getPeriodoDeCierre() {
		return this.periodoDeCierre;
	}

	public void setPeriodoDeCierre(Integer periodoDeCierre) {
		this.periodoDeCierre = periodoDeCierre;
	}

	public int getEmpresaCuit() {
		return this.empresaCuit;
	}

	public void setEmpresaCuit(int empresaCuit) {
		this.empresaCuit = empresaCuit;
	}
}