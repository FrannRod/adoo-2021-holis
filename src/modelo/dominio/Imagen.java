package modelo.dominio;
public class Imagen{

	private String encabezado;
	private String cuerpo;
	private String pie;
	private String formato;

	// Constructores:
	public Imagen(String nombre, String apellido, String correo, Formato formato){
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.formato = formato;
		
	}

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
		public String getFormato(){
			return this.formato;
		}
	// enum: REVISAR
		enum Formato{
    	png, svg, jpg, jpeg;
	}




}