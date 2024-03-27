package Questao4;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Operaçâo \nAdição \nSubtração \nMultiplicação \nDivisao\n "
				+ "Qual operacão deseja realizar?: ");
		String operacao =input.nextLine();
		
		if(operacao.equals("adicao")) {
			Somar soma = new Somar();
			soma.setOperacao1(Integer.parseInt(input.nextLine()));
			soma.setOperacao2(Integer.parseInt(input.nextLine()));
			soma.imprimirResultado();	
		}else if (operacao.equals("subtracao")) {
			Subtrair subtrair = new Subtrair();
			subtrair.setOperacao1(Integer.parseInt(input.nextLine()));
			subtrair.setOperacao2(Integer.parseInt(input.nextLine()));
			subtrair.imprimirResultado();
		}else if (operacao.equals("multiplicacao")) {
			Multiplicacao multiplicacao = new Multiplicacao();
			multiplicacao.setOperacao1(Integer.parseInt(input.nextLine()));
			multiplicacao.setOperacao2(Integer.parseInt(input.nextLine()));
			multiplicacao.imprimirResultado();
		}else if (operacao.equals("divisao")) {
			Dividir divisao = new Dividir();
			divisao.setOperacao1(Integer.parseInt(input.nextLine()));
			divisao.setOperacao2(Integer.parseInt(input.nextLine()));
			divisao.imprimirResultado();
}	}	}

	


