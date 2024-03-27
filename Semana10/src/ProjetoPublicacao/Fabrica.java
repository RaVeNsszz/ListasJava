package ProjetoPublicacao;

public class Fabrica {
	public static Publicacao fabrica(String opcao) {
		switch(opcao) {
		case("1"):
			return new Livro();
		case("2"):
			return new Revista();
		case("6"):
			return new Quadrinhos();
		}
		return null;
	}

}
