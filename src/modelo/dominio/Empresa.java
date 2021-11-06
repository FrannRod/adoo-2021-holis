package modelo.dominio;
import java.util.List;

public class Empresa {
	private String razonSocial;
	private int cuit;
	private Direccion direccion
	private String correo;
	private String telefono;
	private String tipoDeEmpresa;
	private List<OfertaLaboral> ofertas;
	private String contraseña;
	private String usuario;

	// Constructores
		public Empresa(String razonSocial,int cuit,Direccion direccion,String correo,String telefono,String tipoDeEmpresa,String contraseña,String usuario){
			this.razonSocial = razonSocial;
			this.cuit = cuit;
			this.direccio = direccio;
			this.correo = correo;
			this.tipoDeEmpresa = tipoDeEmpresa;
			this.contraseña = contraseña;
			this.usuario = usuario;
			this.ofertas = new List<OfertaLaboral> ();
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
		public String getContraseña(){
			return contraseña;
		}
		public void setContraseña(String contraseña){
			this.contraseña = contraseña;
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
		public Direccion setDireccion(String direccion){
			this.direccion = direccion;
		}
		public List<OfertaLaboral> getOfertas(){
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