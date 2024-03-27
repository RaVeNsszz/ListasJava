package Questao3;

import java.util.Scanner;

public class Programa {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Criação de Conta");
		System.out.println("Digite \n(1) - Para Criar uma Conta Corrente Normal \n(2) - Para criar uma Conta Corrente Especial");
		int tipo = Integer.parseInt(input.nextLine());
		if (tipo == 1) {
			ContaCorrente conta = new ContaCorrente();
		    System.out.println("Títular: ");
			conta.setTitular(input.nextLine());
			System.out.println("Número da Conta: ");
			conta.setNumeroDaConta(input.nextLine());
			System.out.println("Saldo Inicial: ");
			conta.setSaldo(Float.parseFloat(input.nextLine()));
			System.out.println("Saque: ");
			conta.sacarQuantia(Float.parseFloat(input.nextLine()));
			System.out.println(conta.obterSaldo());

		}else {
			ContaCorrenteEspecial conta = new ContaCorrenteEspecial();
			System.out.println("Títular: ");
			conta.setTitular(input.nextLine());
			System.out.println("Número da Conta: ");
			conta.setNumeroDaConta(input.nextLine());
			System.out.println("Saldo Inicial: ");
			conta.setSaldo(Float.parseFloat(input.nextLine()));
			System.out.println("Saque: ");
			conta.sacarQuantia(Float.parseFloat(input.nextLine()));
			System.out.println(conta.obterSaldo());
		}
	}

}
