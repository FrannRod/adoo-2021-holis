package test;
import controlador.ControladorConfiguracion;
import controlador.ControladorEmpresa;
import controlador.ControladorOfertaLaboral;
import controlador.ControladorPostulante;
import java.util.Date;
import modelo.vo.DireccionVO;
import modelo.vo.EmpresaVO;
import modelo.vo.PostulanteVO;
import modelo.vo.OfertaLaboralVO;
public class Main {
	public static void main(String[] args) {
		ControladorConfiguracion.getInstancia().agregarCategoria("lechería");
		ControladorConfiguracion.getInstancia().agregarPais("Argentina");
		DireccionVO direccion = new DireccionVO("1105","Argentina","CABA","Florida",2,1);
		// Empresa
		EmpresaVO nuevaEmpresa = new EmpresaVO("La lechita feliz S.A.", 216665514, direccion, "leche@feliz.com", "4749-212", "Sociedad Anónima", "1234", "lechefeliz");
		ControladorEmpresa controladorEmpresa = ControladorEmpresa.getInstancia();
		controladorEmpresa.agregarEmpresa(nuevaEmpresa);
		// Oferta
		OfertaLaboralVO oferta = new OfertaLaboralVO("Lechero profesional", true, false, direccion, "lechería", new Float(666.66), new Date(), 3, nuevaEmpresa.getCuit());
		ControladorOfertaLaboral controladorOfertas = ControladorOfertaLaboral.getInstancia();
		controladorOfertas.crearOfertaLaboral(oferta);
		// Postulante
		PostulanteVO postulante = new PostulanteVO("Lautaro", "Gonzales", new Date(), "Argentina", "lautaro", "gonzales2020");
		ControladorPostulante controladorPostulante = ControladorPostulante.getInstancia();
		controladorPostulante.agregarPostulante(postulante);
		// Asociar
		controladorOfertas.postularse(postulante, oferta);
			// No cumple los requisitos. Los agregamos.
		controladorPostulante.agregarInteres(postulante, "lechería");
		controladorOfertas.postularse(postulante, oferta);
		// Verificamos que recorriendo las clases desde la empresa podemos llegar al postulante
	}
}