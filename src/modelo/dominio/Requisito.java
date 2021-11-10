package modelo.dominio;
public class Requisito{
	private String nombre;

	//Constructores:
		public Requisito(String nombre){
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