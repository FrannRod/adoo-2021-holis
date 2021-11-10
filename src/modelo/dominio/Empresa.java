package modelo.dominio;
import java.util.ArrayList;

public class Empresa {
	private String razonSocial;
	private int cuit;
	private Direccion direccion;
	private String correo;
	private String telefono;
	private String tipoDeEmpresa;
	private ArrayList<OfertaLaboral> ofertas;
	private String contrasena;
	private String usuario;

	// Constructores
		public Empresa(String razonSocial,int cuit,Direccion direccion,String correo,String telefono,String tipoDeEmpresa,String contrasena,String usuario){
			this.razonSocial = razonSocial;
			this.cuit = cuit;
			this.direccion = direccion;
			this.correo = correo;
			this.tipoDeEmpresa = tipoDeEmpresa;
			this.contrasena = contrasena;
			this.usuario = usuario;
			this.ofertas = new ArrayList<OfertaLaboral> ();
		}
	// Setters y Getters:
		public String getRazonSocial(){
			return razonSocial;
		}
		public void setRazonSocial(String razonSocial){
			this.razonSocial = razonSocial;
		}
		public int getCuit(){
			return cuit;
		}
		public void setCuit(int cuit){
			this.cuit = cuit;
		}
		public String getCorreo(){
			return correo;
		}
		public void setCorreo(String correo){
			this.correo = correo;
		}
		public String getTipoDeEmpresa(){
			return tipoDeEmpresa;
		}
		public void setTipoDeEmpresa(String tipoDeEmpresa){
			this.tipoDeEmpresa = tipoDeEmpresa;
		}
		public String getContrasena(){
			return contrasena;
		}
		public void setContrasena(String contrasena){
			this.contrasena = contrasena;
		}
		public String getUsuario(){
			return usuario;
		}
		public void setUsuario(String usuario){
			this.usuario = usuario;
		}
		public String getTelefono(){
			return telefono;
		}
		public void setTelefono(String telefono){
			this.telefono = telefono;
		}
		public Direccion getDireccion(){
			return direccion;
		}
		public void setDireccion(Direccion direccion){
			this.direccion = direccion;
		}
		public ArrayList<OfertaLaboral> getOfertas(){
			return ofertas;
		}
	// Collections:
		public void agregarOferta(OfertaLaboral oferta){
			this.ofertas.add(oferta);
		}
		public void eliminarOferta(OfertaLaboral oferta){
			this.ofertas.remove(oferta);
		}
	// Otros métodos:
}