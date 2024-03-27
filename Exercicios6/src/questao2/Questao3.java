package questao2;
import java.util.Scanner;
public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o número em binário: ");
		String num = input.nextLine();
		
		int dec = Integer.parseInt(num,2);
		String hex = Integer.toHexString(dec);
		
		System.out.println("Base Hexagonal: "+hex);
		System.out.println("Base Décimal: "+dec);
		
		
	}

}
