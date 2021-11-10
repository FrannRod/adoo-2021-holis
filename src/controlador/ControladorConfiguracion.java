package controlador;
import modelo.dominio.Idioma;
import modelo.dominio.Pais;
import modelo.dominio.Categoria;
import java.util.ArrayList;
public class ControladorConfiguracion{
	private ArrayList<Idioma> idiomas;
	private ArrayList<Pais> paises;
	private ArrayList<Categoria> categorias;
	private static ControladorConfiguracion instancia;

	// Constructores
		private ControladorConfiguracion(){
			this.idiomas = new ArrayList<Idioma>();
			this.paises = new ArrayList<Pais>();
			this.categorias = new ArrayList<Categoria>();
		}
		public static ControladorConfiguracion getInstancia(){
			if (instancia == null)
				instancia = new ControladorConfiguracion();
			return instancia;
		}
	// Collections:
		public void agregarIdioma(String idioma){
			this.idiomas.add(new Idioma(idioma));
		}
		protected Idioma buscarIdioma(String nombre){
			Idioma resultado = null;
			for (Idioma idioma : idiomas) {
				if (idioma.getNombre() == nombre){
					resultado = idioma;
					break;
				}
			}
			return resultado;
		}

		public void eliminarIdioma(String idioma){
			Idioma elemento = this.buscarIdioma(idioma);
			if (elemento != null)
				this.idiomas.remove(elemento);
		}

		public void agregarPais(String pais){
			this.paises.add(new Pais(pais));
		}
		protected Pais buscarPais(String nombre){
			Pais resultado = null;
			for (Pais pais : paises) {
				if (pais.getNombre() == nombre){
					resultado = pais;
					break;
				}
			}
			return resultado;
		}

		public void eliminarPais(String pais){
			Pais elemento = this.buscarPais(pais);
			if (elemento != null)
				this.paises.remove(elemento);
		}
		public void agregarCategoria(String categoria){
			this.categorias.add(new Categoria(categoria));
		}
		protected Categoria buscarCategoria(String nombre){
			Categoria resultado = null;
			for (Categoria categoria : categorias) {
				if (categoria.getNombre() == nombre){
					resultado = categoria;
					break;
				}
			}
			return resultado;
		}

		public void eliminarCategoria(String categoria){
			Categoria elemento = this.buscarCategoria(categoria);
			if (elemento != null)
				this.categorias.remove(elemento);
		}
}