package controlador;
import modelo.dominio.Empresa;
import modelo.vo.EmpresaVO;
import java.util.ArrayList;
public class ControladorEmpresa{
	private ArrayList<Empresa> empresas;
	private static ControladorEmpresa instancia;
	// Constructores
		private ControladorEmpresa(){
			this.empresas = new ArrayList<Empresa>();
		}
		public static ControladorEmpresa getInstancia(){
			if (this.instancia == null)
				this.instancia = new ControladorEmpresa();
			return instancia;
		}
	// Collections:
		public void agregarEmpresa(EmpresaVO vo){
			Empresa empresa = new Empresa(	vo.razonSocial,
											vo.cuit,
											vo.direccion,
											vo.correo,
											vo.telefono,
											vo.tipoDeEmpresa,
											vo.contraseña,
											vo.usuario
										  );
			this.empresas.add(empresa);
			System.out.println("Empresa " + vo.razonSocial + " creada");
		}
		protected Empresa buscarEmpresa(String cuit){
			Empresa resultado;
			for (Empresa empresa : empresas) {
				if (Empresa.getCuit() == cuit){
					resultado = Empresa;
					break;
				}
			}
			return resultado;
		}
		public void eliminarEmpresa(String cuit){
			Empresa elemento = this.buscarEmpresa(cuit);
			if (elemento != null)
				this.empresas.remove(elemento);
		}
		public boolean modificarEmpresa(EmpresaVO vo){
			Empresa empresa = this.buscarEmpresa(vo.cuit);
			if (empresa == null)
				return false;
			empresa.setRazonSocial(vo.getRazonSocial());
			empresa.setDireccion(vo.getDireccion());
			empresa.setCorreo(vo.getCorreo());
			empresa.setTelefono(vo.getTelefono());
			empresa.setTipoDeEmpresa(vo.getTipoDeEmpresa());
			empresa.setContraseña(vo.getContraseña());
			empresa.setUsuario(vo.getUsuario());
			return true;
		}
}