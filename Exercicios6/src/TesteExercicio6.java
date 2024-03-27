import java.util.Scanner;
public class TesteExercicio6 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Infome uma lista de números: ");
		String[] lista = input.nextLine().split(",");
		//q1
		int max=Integer.parseInt( lista[0] );
		int min=Integer.parseInt( lista[0] );
		
		for (String s: lista) {
			int valor = Integer.parseInt(s);
			max = Math.max(max, valor);
			min = Math.min(min, valor);	
		}
		System.out.println("O maior número lido foi: "+max);
		System.out.println("O menor número lido foi: "+min);
		

}	}

