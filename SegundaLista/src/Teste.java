import java.util.Scanner;
public class Teste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		ProdutoImportado produto = new ProdutoImportado();
		AgenteDeImportacao agente = new AgenteDeImportacao();
		// eu tinha esquecido de criar um abjeto para poder ultilizar os metodos
		System.out.println("Produtos a serem Importados ");
		System.out.println("Tipo: ");
		produto.setTipo(input.nextLine());
		
		System.out.println("Preço: ");
		produto.setPreco(input.nextFloat());
		input.close();
		//float resultado = produto.calcularImposto;
		System.out.println("Custo Final: "+agente.calcularImposto(produto));
		
	}

}
