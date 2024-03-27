package CompanhiaAerea;

public class Cliente {
	private String nome;
	private String CPF;
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public String getNome() {
		return nome;
	}
	public void setCPF(String novoCPF) {
		CPF = novoCPF;
	}
	public String getCPF() {
		return CPF;
	}
}
