import java.util.Scanner;
// q10 lista 4
public class QuadradoERetangulo {
	public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
		Retangulo usuario = new Retangulo();
		
		usuario.setBase(Integer.parseInt(input.nextLine()));
		usuario.setAltura(Integer.parseInt(input.nextLine()));
		
		System.out.println(usuario.isQuadrado()?"Não é um quadrado":"É um quadrado");
		usuario.autodesenhar();
		input.close();
	}
}
