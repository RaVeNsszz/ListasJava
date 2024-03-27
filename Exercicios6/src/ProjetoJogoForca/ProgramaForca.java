package ProjetoJogoForca;
import java.util.Scanner;
public class ProgramaForca {
	public static void main(String [] args) {
		Palavra[] arrayPalavra = new Palavra[5];
		Scanner input = new Scanner(System.in);
		JogaDaForca jogo = new JogaDaForca();
		Palavra palavra = new Palavra();
		
		for (int i = 0;i<arrayPalavra.length;i++) {
			System.out.println("Palavra: ");
			palavra.setPalavra(input.nextLine());
			System.out.println("Dica: ");
			palavra.setDica(input.nextLine());
			arrayPalavra[i]=palavra;
		}
		jogo.setDicionario(arrayPalavra); 
		jogo.sortear();
		
		System.out.println("GABARITO");
		System.out.println(jogo.getGabarito());
		int opcao = 0;
		int qtdErradas = 0;
		do {
			System.out.println("(1)Palpitar ");
			System.out.println("(2)Dica ");
			opcao = Integer.parseInt(input.nextLine());
			if (opcao == 1) {
				System.out.println("Digite o palpite: ");
				char palpite = input.next().toUpperCase().charAt(0);
				if (jogo.testarLetra(palpite)) {
					System.out.println("Acertou");
				}else {
					System.out.println(" Errou ");
					qtdErradas++;
				}
			}else {
				System.out.println(jogo.getDicionario()[jogo.getPosicaoSort()].getDica());
			}
		}while(jogo.testarSeAcabou()==true);
		
		int pontuacao = 2 * (jogo.palavraSorteada().length()) - qtdErradas;
		System.out.println("VOCÊ PONTUOU: "+pontuacao);
	}

}
