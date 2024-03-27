import java.util.Scanner;

public class VerificadorMeses {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um mês: ");
		String mes = leitor.nextLine().toUpperCase();
		
		switch(mes){
			case ("FEVEREIRO"):
				System.out.println(mes+" tem 28 dias, em anos bissextos possue 29.");
			break;
			case ("ABRIL" ):
				System.out.println(mes+" possue 30 dias.");
			break;
			case ("JUNHO"):
				System.out.println(mes+" possue 30 dias.");
			break;
			case ("SETEMBRO"):
				System.out.println(mes+" possue 30 dias.");
			break;
			case ("NOVEMBRO"):
				System.out.println(mes+" possue 30 dias.");
			break;
			case ("JANEIRO"):
				System.out.println(mes+" possue 31 dias.");
			break;
			case("MARÇO"):
				System.out.println(mes+" possue 31 dias.");
			break;
			case("MAIO"):
				System.out.println(mes+" possue 31 dias.");
			break;
			case("JULHO"):
				System.out.println(mes+" possue 31 dias.");
			break;
			case("AGOSTO"):
				System.out.println(mes+" possue 31 dias.");
			break;
			case("OUTUBRO"):
				System.out.println(mes+" possue 31 dias.");
			break;
			case("DEZEMBRO"):
				System.out.println(mes+" possue 31 dias.");
			break;
		}
		leitor.close();;

	}

}
