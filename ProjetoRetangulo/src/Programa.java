import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Retangulo r = new Retangulo();
		
		//System.out.println("Base: ");
		System.out.println("Base: ");
		r.setBase(input.nextInt());
		System.out.println("Altura: ");
		r.setAltura(input.nextInt());
		
		input.close();
		
		System.out.println("Área do retângulo: "+r.area(r.getBase(), r.getAltura()));
		System.out.println("Perímetro: "+r.perimetro(r.getBase(), r.getAltura()));
		
	}

}
