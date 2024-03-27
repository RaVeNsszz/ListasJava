package questao2;
import java.util.Scanner;
public class Questao2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = input.nextLine();
		int vog = 0; int cos = 0;
		
		
		for (int i = 0;i<frase.length();i++) {
			if((frase.charAt(i) == 'a')||(frase.charAt(i)=='e')||(frase.charAt(i)=='i')||(frase.charAt(i)=='o')||(frase.charAt(i)=='u')) {
				vog++;
			
			}else if((frase.charAt(i) == 'A')||(frase.charAt(i)=='E')||(frase.charAt(i)=='I')||(frase.charAt(i)=='O')||(frase.charAt(i)=='U')) {
				
			}else if (frase.charAt(i)==' ') {
				
			}else {
				cos++;
			}
		}
		System.out.println("Vogais: "+vog);
		System.out.println("Consoantes: "+cos);
		
	}

}
