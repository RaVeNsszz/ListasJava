import java.util.Scanner;
public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome 1: ");
		String nome1 = (input.nextLine());//.toUpperCase();
		
		System.out.println("Nome 2: ");
		String nome2 = input.nextLine();//.toUpperCase();
		
		input.close();
		
		if(nome1.equals(nome2)){
			System.out.println("O Nome "+nome1+" é igual ao nome "+nome2+".");
		}else {
			System.out.println("O nome "+nome1+" é distinto do nome "+nome2+".");
		}
		
	}

}
