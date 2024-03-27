import java.util.Scanner;
public class Classificação {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pasciente dados = new Pasciente();
		Nutricionista nutricionista = new Nutricionista();
		
		System.out.println("Peso: ");
		dados.setPeso(Float.parseFloat(input.nextLine()));
		
		System.out.println("Altura: ");
		dados.setAltura(Float.parseFloat(input.nextLine()));
		
		System.out.print("Classificação: "+nutricionista.resultadoIMC(dados));
		//System.out.println(ResultadoIMC.);
		input.close();
	}

}
