package modelo.dominio;
public class Pais {
	String nombre;
	String idioma;

	// Constructores:
		public Pais(String nombre, String idioma){
			this.nombre = nombre;
			this.idioma = idioma;
		}
	// Setters y Getters:
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public String getNombre(){
			return this.nombre;
		}
		public void setIdioma(String idioma){
			this.idioma = idioma;
		}
		public String getIdioma(){
			return this.idioma;
		}
}