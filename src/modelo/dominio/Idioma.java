package modelo.dominio;
public class Idioma{

	private String nombre;

	// Constructores:
		public Idioma(String nombre){
			this.nombre = nombre;
		}
	// Setters y Getters:
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public String getNombre(){
			return this.nombre;
		}
}