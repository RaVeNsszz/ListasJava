package Questao3;

public class Pessoa {
	
	private int anoNascimento;
	private String nome;
	
	public Pessoa(String novoNome,int ano) {
		anoNascimento = ano;
		nome = novoNome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
