package ProjetoPublicacao;

import java.util.Scanner;

public abstract class Publicacao {
	private String nome;
	Scanner sc = new Scanner(System.in);
	//public abstract String toString();
	public abstract void mostrar();	
	public abstract void introduzDados();
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public String getNome() {
		return nome;
	}
	

}
