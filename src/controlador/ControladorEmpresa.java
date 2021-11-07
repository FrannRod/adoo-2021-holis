package controlador;
import modelo.dominio.Empresa;
import modelo.vo.EmpresaVO;
import java.util.List;
public class ControladorEmpresa{
	private List<Empresa> empresas;

	// Constructores
		public ControladorEmpresa(){
			this.empresas = new List<Empresa>();
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
		}
		private Empresa buscarEmpresa(String cuit){
			Empresa resultado;
			for (Empresa empresa : empresas) {
				if (Empresa.getCuit() == cuit){
					resultado = Empresa;
					break;
				}
			}
			return resultado
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
			empresa.setRazonSocial(vo.razonSocial);
			empresa.setDireccion(vo.direccion);
			empresa.setCorreo(vo.correo);
			empresa.setTelefono(vo.telefono);
			empresa.setTipoDeEmpresa(vo.tipoDeEmpresa);
			empresa.setContraseña(vo.contraseña);
			empresa.setUsuario(vo.usuario);
			return true;
		}
}