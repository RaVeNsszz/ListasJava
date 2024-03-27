package FormataçãoDeTexTo;
import java.util.Scanner;
public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FormatacaoTexto formatar = null ;
		
		String texto = input.nextLine();
		
		System.out.println("Tipo de formatações disponíveis: (maiuscula), (minuscula) e (invertida) ");
		String formatacao = input.nextLine();
		
		if(formatacao.equals("maiuscula")) {
			formatar = new Maiuscula();
		}else if(formatacao.equals("minuscula")) {
			formatar = new Minuscula();
		}else if(formatacao.equals("invertida")) {
			formatar = new Invertida();
		}
		System.out.println(formatar.formatarTexto(texto));
}	}

