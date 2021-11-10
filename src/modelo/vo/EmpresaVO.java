package modelo.vo;

public class EmpresaVO {
	private String razonSocial;
	private int cuit;
	private DireccionVO direccion;
	private String correo;
	private String telefono;
	private String tipoDeEmpresa;
	private String contraseña;
	private String usuario;

	// Constructores
		public EmpresaVO(String razonSocial,int cuit,DireccionVO direccion,String correo,String telefono,String tipoDeEmpresa,String contraseña,String usuario){
			this.razonSocial = razonSocial;
			this.cuit = cuit;
			this.direccion = direccion;
			this.correo = correo;
			this.tipoDeEmpresa = tipoDeEmpresa;
			this.contraseña = contraseña;
			this.usuario = usuario;
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
		public DireccionVO getDireccion(){
			return direccion;
		}
		public DireccionVO setDireccion(String direccion){
			this.direccion = direccion;
		}
}