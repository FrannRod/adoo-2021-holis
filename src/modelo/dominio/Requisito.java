package modelo.dominio;
public class requisito{
	private String nombre;

	//Constructores:
		public requisito(String nombre){
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