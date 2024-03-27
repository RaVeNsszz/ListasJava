package Questao3;
import Questao2.FabricaJOptionPane;

public class ProgramaPessoa {
	
	public static void main(String[] args) {
		Pessoa[] vetor = new Pessoa[2];
		TelaPadrao tela = new TelaPadrao("Primeira Tela");
		
		for(int i = 0;i<vetor.length;i++) {
			String nome = FabricaJOptionPane.criarInput("Digite seu Nome: ");
			int ano = Integer.parseInt(FabricaJOptionPane.criarInput("Digite Ano de Nascimento: "));
			Pessoa pessoa = new Pessoa(nome,ano);
			vetor[i] = pessoa;

		}
		
	}

}
