package test;
import controlador.ControladorEmpresa;
import controlador.ControladorOfertaLaboral;
import controlador.ControladorConfiguracion;
import modelo.vo.EmpresaVO;
import modelo.vo.DireccionVO;
import modelo.vo.OfertaLaboralVO;
import java.util.Date;
public class Main {
	public static void main(String[] args) {
		DireccionVO direccion = new DireccionVO("String codigoPostal","String nombrePais","String localidad","String calle",2,1);
		ControladorConfiguracion.getInstancia().agregarCategoria("lechería");
		// Empresa
		EmpresaVO nuevaEmpresa = new EmpresaVO("La lechita feliz S.A.", 216665514, direccion, "leche@feliz.com", "4749-212", "Sociedad Anónima", "1234", "lechefeliz");
		ControladorEmpresa controladorEmpresa = ControladorEmpresa.getInstancia();
		controladorEmpresa.agregarEmpresa(nuevaEmpresa);
		// Oferta
		OfertaLaboralVO oferta = new OfertaLaboralVO("Lechero", true, false, direccion, "lechería", new Float(666.66), new Date(), 3, nuevaEmpresa.getCuit());
		ControladorOfertaLaboral controladorOfertas = ControladorOfertaLaboral.getInstancia();
		controladorOfertas.crearOfertaLaboral(oferta);
		// Postulante
		// Asociar
	}
}