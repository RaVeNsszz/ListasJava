package Questao1;
import java.util.Scanner;
public class ProgramaData {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		boolean dataValida = false;
		do {
			System.out.println("Informe uma data: ");
			String[] data = input.nextLine().split("/");
		try {
			MinhaData minhaData = new MinhaData(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2]));
			//MinhaData minhaData = new MinhaData(28,9,2001);
			dataValida = true;
		}catch(Exception e) {
			System.out.println("Data Inválida");
		}
		}while(!dataValida);
		
	} 
}
