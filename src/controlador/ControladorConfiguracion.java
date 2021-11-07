package controlador;
import modelo.dominio.Idioma;
import modelo.dominio.Pais;
import modelo.dominio.Categoria;
import java.util.List;
public class ControladorConfiguracion{
	private List<Idioma> idiomas;
	private List<Pais> paises;
	private List<Categoria> categorias;
	private static ControladorConfiguracion instancia;

	// Constructores
		private ControladorConfiguracion(){
			this.idiomas = new List<Idioma>();
			this.paises = new List<Pais>();
			this.categorias = new List<Categoria>();
		}
		public ControladorEmpresa getInstancia(){
			if (this.instancia == null)
				this.instancia = new ControladorEmpresa();
			return instancia;
		}
	// Collections:
		public void agregarIdioma(String idioma){
			this.idiomas.add(new Idioma(idioma));
		}
		private Idioma buscarIdioma(String nombre){
			Idioma resultado;
			for (Idioma idioma : idiomas) {
				if (idioma.getNombre() == nombre){
					resultado = idioma;
					break;
				}
			}
			return resultado
		}

		public void eliminarIdioma(String idioma){
			Idioma elemento = this.buscarIdioma(idioma);
			if (elemento != null)
				this.idiomas.remove(elemento);
		}

		public void agregarPais(String pais){
			this.paises.add(new Pais(pais));
		}
		private Pais buscarPais(String nombre){
			Pais resultado;
			for (Pais pais : paises) {
				if (pais.getNombre() == nombre){
					resultado = pais;
					break;
				}
			}
			return resultado
		}

		public void eliminarPais(String paises){
			Pais elemento = this.buscarPais(pais);
			if (elemento != null)
				this.paises.remove(elemento);
		}
		public void agregarCategoria(String categoria){
			this.categorias.add(new Categoria(categoria));
		}
		private Categoria buscarCategoria(String nombre){
			Categoria resultado;
			for (Categoria categoria : categorias) {
				if (categoria.getNombre() == nombre){
					resultado = categoria;
					break;
				}
			}
			return resultado
		}

		public void eliminarCategoria(String categoria){
			Categoria elemento = this.buscarCategoria(categoria);
			if (elemento != null)
				this.categorias.remove(elemento);
		}
}