package Questao5;
import java.util.Scanner;
public class Programa {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Preço: ");
		float preco =Float.parseFloat(input.nextLine());
		
		System.out.println("Tipo Novo ou Usado: ");
		String tipo = input.nextLine().toUpperCase();
		
		Carro carro = Fabrica.fabrica(preco, tipo);
		System.out.println("Valor: ");
		System.out.println(carro.toString());
		
		input.close();
	}

}
