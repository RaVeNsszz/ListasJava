package ProjetoPublicacao;

public class Livro extends Publicacao{
	
	private String autor;
	private int ano;

	public void mostrar() {
		System.out.println("Nome: "+getNome()+" Autor: "+getAutor()+" Ano: "+getAno());
	}

	public void introduzDados() {
		System.out.println("Nome: ");
		setNome(sc.nextLine());
		System.out.println("Autor: ");
		setAutor(sc.nextLine());
		System.out.println("Ano: ");
		setAno(Integer.parseInt(sc.nextLine()));
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}	
}
