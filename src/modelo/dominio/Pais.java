package modelo.dominio;
public class Pais {
	private String nombre;

	// Constructores:
		public Pais(String nombre){
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