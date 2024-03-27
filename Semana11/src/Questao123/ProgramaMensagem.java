package Questao123;

import java.util.Scanner;

public class ProgramaMensagem {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma mensagem");
		String mensagemRecebida = leitor.nextLine();
		
		System.out.println("Digite para onde deseja enviar 1-> Interno 2-> Externo: ");
		int numeroRecebido = Integer.parseInt(leitor.nextLine());
		
		Mensageiro mensageiro = new Mensageiro();
		Mensagem mensagem = mensageiro.prepararMensagem(mensagemRecebida, numeroRecebido);
		System.out.println(mensagem.getTexto());
		

	}

}
