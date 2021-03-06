package test;
import controlador.ControladorConfiguracion;
import controlador.ControladorEmpresa;
import controlador.ControladorOfertaLaboral;
import controlador.ControladorPostulante;
import java.util.Date;
import modelo.patrones.moduloImagen.Formato;
import modelo.vo.DireccionVO;
import modelo.vo.EmpresaVO;
import modelo.vo.OfertaLaboralVO;
import modelo.vo.PostulanteVO;
public class Main {
	public static void main(String[] args) {
		ControladorConfiguracion.getInstancia().agregarCategoria("lechería");
		ControladorConfiguracion.getInstancia().agregarPais("Argentina");
		DireccionVO direccion = new DireccionVO("1105","Argentina","CABA","Florida",2,1);
		// Empresa
		EmpresaVO nuevaEmpresa = new EmpresaVO("La vaca feliz S.A.", 216665514, direccion, "vaca@feliz.com", "4749-212", "Sociedad Anónima", "1234", "vacafeliz");
		ControladorEmpresa controladorEmpresa = ControladorEmpresa.getInstancia();
		controladorEmpresa.agregarEmpresa(nuevaEmpresa);
		// Oferta
		OfertaLaboralVO oferta = new OfertaLaboralVO("Operario", true, false, direccion, "lechería", new Float(666.66), new Date(), 3, nuevaEmpresa.getCuit());
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
		// Cerramos la oferta
		controladorOfertas.cerrarOfertaLaboral(oferta);
		// Imagen
		controladorOfertas.generarImagen(oferta, "archivoNombre", Formato.PNG);
	}
}