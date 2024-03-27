import java.util.Scanner;
public class ProgramaNP {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CDF verificador = new CDF();
		
		
		System.out.println("Informe um número: ");
		int num =  Integer.parseInt(input.nextLine());
		if(verificador.ePerfeito(num)) {
			System.out.println("Valor informado é perfeito!");
		}else {
			System.out.println("Valor informado não é perfeito!");
		}
		input.close();
		
	}

}
