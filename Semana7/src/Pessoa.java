public class Pessoa {
	private String nome;
	private EstadoCivil estadoCivil;
	private int idade;
	
	public Pessoa() {
		nome = "Desconhecido";
		estadoCivil = EstadoCivil.SOLTEIRO;
		idade = 5;
	}
	
	public Pessoa(String nome,EstadoCivil estadoCivil,int idade) {
		this.nome = nome;
		this.estadoCivil = estadoCivil;
		this.idade = idade;
	} 
	public boolean equals(Pessoa p) {
		if((this.getNome().equals(p.nome))&&(this.getEstadoCivil().equals(p.estadoCivil))&& (this.getIdade()==p.idade)){
	    	return true;
		}
		return false;
	}
	public String toString() {
		String caracterizacao = " ";
		if (idade < 12) {
			caracterizacao = "Infância";
		}else if(idade<21) {
			caracterizacao = "Adolecência";
		}else if(idade<60) {
			caracterizacao = "Fase Adulta";
		}else if (idade >59) {
			caracterizacao = "Velhice";
		}
		return nome+" "+caracterizacao;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public String getNome() {
		return nome;
	}
	public void setEstadoCivil(EstadoCivil novoEstado) {
		this.estadoCivil = novoEstado;
	}
	
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setIdade(int novaIdade) {
		idade = novaIdade;
	}
	public int getIdade() {
		return idade;
	}

}
