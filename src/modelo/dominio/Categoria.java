package modelo.dominio;
public class Categoria{
	private String nombre;

	// Constructores:
		public Categoria(String nombre){
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