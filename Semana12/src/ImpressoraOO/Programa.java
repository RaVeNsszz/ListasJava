package ImpressoraOO;
import java.util.Scanner;
public class Programa {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String opcao;
		Impressora impressora = new Impressora();
		
		do {
			System.out.println(impressora.getCargaToner()+", "+impressora.getQtdFolhasImpressas()+", "+impressora.getQtdPaginas());
			System.out.println("1 - Imprimir\n"
					+ "2 - Carregar papel na impressora\n"
					+ "3 - Trocar o toner da impressora\n"
					+ "4 - Sair");
			opcao = input.nextLine();
			switch(opcao) {
			case "1":
				try {
					System.out.println("Quantidade de Páginas que deseja imprimir: ");
					//int qtdPaginas = Integer.parseInt(input.nextLine());
					impressora.imprimir(Integer.parseInt(input.nextLine()));		
				}catch(FaltouPapelException | FaltouTintaException  e) {
					System.out.println(e.getMessage());
				}
				break;
			case "2":
				System.out.println("Quantas folhas deseja Adiconar: ");
				impressora.setQtdPaginas(impressora.getQtdPaginas() + Integer.parseInt(input.nextLine()));
				break;
			case "3":
				impressora.setCargaToner(10);
				System.out.println("Carga Toner trocado");
				break;
			}
		}while(!opcao.equals("4"));
		System.out.println(impressora.getQtdFolhasImpressas());
	} 
}
