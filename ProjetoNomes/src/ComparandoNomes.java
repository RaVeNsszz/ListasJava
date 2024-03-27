import java.util.Scanner;
public class ComparandoNomes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
			
		String nome1 = leitor.nextLine();
		String nome2 = leitor.nextLine();
		
		while((nome1.compareTo(nome2)) < 0) {
			System.out.println("As duas entradas devem ser diferentes");
			nome1 = leitor.nextLine();
			nome2 = leitor.nextLine();			
		}
		System.out.println(nome1+", "+nome2);
		leitor.close();

	}

}
