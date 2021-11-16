package modelo.patrones.moduloImagen;

public class Imagen{

	private String encabezado;
	private String cuerpo;
	private String pie;
	private Formato formato;

	// Setters y Getters:
		public void setEncabezado(String encabezado){
			this.encabezado = encabezado;
		}
		public String getEncabezado(){
			return this.encabezado;
		}

		public void setCuerpo(String cuerpo){
			this.cuerpo = cuerpo;
		}
		public String getCuerpo(){
			return this.cuerpo;
		}

		public void setPie(String pie){
			this.pie = pie;
		}
		public String getPie(){
			return this.pie;
		}

		public void setFormato(Formato formato){
			this.formato = formato;
		}
		public Formato getFormato(){
			return this.formato;
		}
}