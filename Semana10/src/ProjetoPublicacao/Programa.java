package ProjetoPublicacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Publicacao publicacao = null;
	
		ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();
		
		String var = "";
		int countLivro = 0;
		int countRevista = 0;
	
		do {
			System.out.println("MENU"
					+"\n1 - Cadastrar novo livro"
					+"\n2 - Cadastrar nova revista"
					+"\n3 - Lista todas as publicações"
					+"\n4 - Listar apenas os livro"
					+"\n5 - Listar apenas as revista"
					+"\n6 - Cadastrar novo Quadrinho"
					+"\nS - Sair");
			
			var = input.nextLine().toUpperCase();
			
			switch (var) {
			case("1"):
			case("2"):
			case("6"):
				publicacao = Fabrica.fabrica(var);
				publicacao.getClass();
				publicacao.introduzDados();
				publicacoes.add(publicacao);
				System.out.println("Publicação Adicionada");
				break;

			case("3"):
				for(Publicacao publi: publicacoes) {
					publi.mostrar();
				}
			case("4"):
			case("5"):
				
				for (Publicacao publi : publicacoes) {
	                if(var.equals("4") && publi instanceof Livro) {
                        publi.mostrar();

                    }else if(var.equals("5") && publi instanceof Revista) {
                        publi.mostrar();
                    }
                }
				
			}
		}while(!var.equals("S"));
		System.out.println(countLivro+" livros Cadastrados");
		System.out.println(countRevista+" Revistas Cadastradas");
	}

}
