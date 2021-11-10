package modelo.vo;

public class DireccionVO {

	private String codigoPostal;
	private String nombrePais;
	private String localidad;
	private String calle;
	private int numero;
	private int piso;

	// Constructores:
		public DireccionVO(String codigoPostal,String nombrePais,String localidad,String calle,int numero,int piso){
			this.codigoPostal = codigoPostal;
			this.nombrePais = nombrePais;
			this.localidad = localidad;
			this.calle = calle;
			this.numero = numero;
			this.piso = piso;
		}
	// Setters y Getters:
		public String getCodigoPostal(){
			return codigoPostal;
		}
		public void setCodigoPostal(String codigoPostal){
			this.codigoPostal = codigoPostal;
		}
		public String getPais(){
			return nombrePais;
		}
		public void setPais(String nombrePais){
			this.nombrePais = nombrePais;
		}
		public String getLocalidad(){
			return localidad;
		}
		public void setLocalidad(String localidad){
			this.localidad = localidad;
		}
		public String getCalle(){
			return calle;
		}
		public void setCalle(String calle){
			this.calle = calle;
		}
		public int getNumero(){
			return numero;
		}
		public void setNumero(int numero){
			this.numero = numero;
		}
		public int getPiso(){
			return piso;
		}
		public void setPiso(int piso){
			this.piso = piso;
		}
}