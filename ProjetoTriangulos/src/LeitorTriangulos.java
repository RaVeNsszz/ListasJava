import java.util.Scanner;
public class LeitorTriangulos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Triangulo t = new Triangulo();
		
		int var = 0;
		int contE = 0;
		int contI = 0;
		int contEs = 0;
		do {
			System.out.println("Lado 1: ");
			t.setLado1(Integer.parseInt(leitor.nextLine()));
			System.out.println("Lado 2: ");
			t.setLado2(Integer.parseInt(leitor.nextLine()));
			System.out.println("Lado 3: ");
			t.setLado3(Integer.parseInt(leitor.nextLine()));
			System.out.println(t.tipo());
			System.out.print("Deseja continuar SIM(0) ou NÃO(1): ");
			var = Integer.parseInt(leitor.nextLine());
			if (t.tipo() == TiposDeTriangulo.Equilatero ) {
				contE++;
			}else if(t.tipo() == TiposDeTriangulo.Isosceles) {
				contI++;
			}else {
				contEs++;
			}
			
		}while(var == 0);
					
		System.out.println("Quantidade de Equilateros: "+contE);
		System.out.println("Quantidade de Isoceles: "+contI);
		System.out.println("Quantidade de Escalenos: "+contEs);
		leitor.close();
	}
}
