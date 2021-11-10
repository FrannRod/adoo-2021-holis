package controlador;
import modelo.dominio.Empresa;
import modelo.dominio.Direccion;
import modelo.dominio.Pais;
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
			if (instancia == null)
				instancia = new ControladorEmpresa();
			return instancia;
		}
	// Collections:
		public void agregarEmpresa(EmpresaVO vo){
			Pais pais = ControladorConfiguracion.getInstancia().buscarPais(vo.getDireccion().getPais());
			Direccion direccion = new Direccion(vo.getDireccion().getCodigoPostal(), pais, vo.getDireccion().getLocalidad(), vo.getDireccion().getCalle(), vo.getDireccion().getNumero(), vo.getDireccion().getPiso());
			Empresa empresa = new Empresa(	vo.getRazonSocial(),
											vo.getCuit(),
											direccion,
											vo.getCorreo(),
											vo.getTelefono(),
											vo.getTipoDeEmpresa(),
											vo.getContraseña(),
											vo.getUsuario()
										  );
			this.empresas.add(empresa);
			System.out.println("Empresa " + vo.getRazonSocial() + " creada");
		}
		protected Empresa buscarEmpresa(Integer cuit){
			Empresa resultado;
			for (Empresa empresa : empresas) {
				if (empresa.getCuit() == cuit){
					resultado = empresa;
					break;
				}
			}
			return resultado;
		}
		public void eliminarEmpresa(Integer cuit){
			Empresa elemento = this.buscarEmpresa(cuit);
			if (elemento != null)
				this.empresas.remove(elemento);
		}
		public boolean modificarEmpresa(EmpresaVO vo){
			Empresa empresa = this.buscarEmpresa(vo.getCuit());
			if (empresa == null)
				return false;
			empresa.setRazonSocial(vo.getRazonSocial());
			empresa.setCorreo(vo.getCorreo());
			empresa.setTelefono(vo.getTelefono());
			empresa.setTipoDeEmpresa(vo.getTipoDeEmpresa());
			empresa.setContraseña(vo.getContraseña());
			empresa.setUsuario(vo.getUsuario());
			return true;
		}
}