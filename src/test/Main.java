package test;
import controlador.ControladorEmpresa;
import modelo.vo.EmpresaVO;
public class Main {
	public static void main(String[] args) {
		EmpresaVO nuevaEmpresa = new EmpresaVO("La lechita feliz S.A.", 216665514, null, "leche@feliz.com", "4749-212", "Sociedad Anónima", "1234", "lechefeliz");
		ControladorEmpresa controladorEmpresa = ControladorEmpresa.getInstancia();
		controladorEmpresa.agregarEmpresa(nuevaEmpresa);
	}
}