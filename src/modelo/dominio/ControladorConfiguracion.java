package modelo.dominio;
public class ControladorConfiguracion{
	private List<Idioma> idiomas;
	private List<Pais> paises;
	private List<Categoria> categoria;

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