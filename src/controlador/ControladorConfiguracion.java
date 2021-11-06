package controlador;
import modelo.dominio.Idioma;
import modelo.dominio.Pais;
import modelo.dominio.Categoria;
public class ControladorConfiguracion{
	private List<Idioma> idiomas;
	private List<Pais> paises;
	private List<Categoria> categoria;

	// Constructores
		public ControladorConfiguracion(){
			this.idiomas = new List<Idioma>();
			this.paises = new List<Pais>();
			this.categoria = new List<Categoria>();
		}
	// Collections:
		public void agregarIdioma(Idioma idiomas){
			this.Idiomas.add(idioma);
		}

		public void eliminarIdioma(Idioma idiomas){
			this.Idiomas.remove(idioma);
		}

		public void agregarPais(Pais paises){
			this.Pais.add(paises);
		}

		public void eliminarPais(Pais paises){
			this.Pais.remove(paises);
		}
		public void agregarCategoria(Categoria categoria){
			this.Categoria.add(categoria);
		}

		public void eliminarCategoria(Categoria categoria){
			this.Categoria.remove(categoria);
		}
}