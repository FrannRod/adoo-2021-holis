package test;
import controlador.ControladorEmpresa;
import modelo.vo.EmpresaVO;
import modelo.vo.DireccionVO;
public class Main {
	public static void main(String[] args) {
		DireccionVO direccion = new DireccionVO("String codigoPostal","String nombrePais","String localidad","String calle",2,1);
		EmpresaVO nuevaEmpresa = new EmpresaVO("La lechita feliz S.A.", 216665514, direccion, "leche@feliz.com", "4749-212", "Sociedad Anónima", "1234", "lechefeliz");
		ControladorEmpresa controladorEmpresa = ControladorEmpresa.getInstancia();
		controladorEmpresa.agregarEmpresa(nuevaEmpresa);
	}
}