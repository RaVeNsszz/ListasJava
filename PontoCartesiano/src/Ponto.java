import java.util.Scanner;
public class Ponto {
	private int coordenadaX;
	private int coordenadaY;
	
	public void setCoordenadaX(int x) {
		coordenadaX = x;
	}
	public int getCoordenadaX() {
		return coordenadaX;
	}
	
	public void setCoordenadaY(int y) {
		coordenadaY = y;
	}
	public int getCoordenadaY() {
		return coordenadaY;
	}
	
	public boolean eIgual(Ponto p) {// Tem que comparar o estado do primeiro id com o seg
		return ((coordenadaX == p.getCoordenadaX())&&(coordenadaY == p.getCoordenadaY())? false:true);
	}
	
	public String quadrante() {
		String quadrante = "";
		if ((coordenadaX > 0)&&(coordenadaY > 0)){
			quadrante = "1° Quadrante";
		}else if ((coordenadaX < 0)&&(coordenadaY > 0)) {
			quadrante = "2° Quadrante";
		}else if ((coordenadaX < 0)&&(coordenadaY < 0)) {
			quadrante ="3° Quadrante"; 
		}else if((coordenadaX > 0)&&(coordenadaY < 0)) {
			quadrante = "4° Quadrante";
		}else if((coordenadaX == 0)&&(coordenadaY==0)){
			quadrante = "Origem";
	    }else if (coordenadaX == 0) {
			quadrante = "Eixo Horizontal";
		}else if(coordenadaY == 0) {
			quadrante = "Eixo Vertical";
		}
		return quadrante;	
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ponto localizacao = new Ponto();
		Ponto localizacao2 = new Ponto();
		
		System.out.println("X1 = ");
		localizacao.setCoordenadaX(Integer.parseInt(input.nextLine()));
		System.out.println("Y1 = ");
		localizacao.setCoordenadaY(Integer.parseInt(input.nextLine()));
		System.out.println("Primeiro ponto está no(a) "+localizacao.quadrante());
		
		System.out.println("X2 = ");
		localizacao2.setCoordenadaX(Integer.parseInt(input.nextLine()));		
		System.out.println("Y2 = ");
		localizacao2.setCoordenadaY(Integer.parseInt(input.nextLine()));
		System.out.println("Segundo ponto está no(a) "+localizacao2.quadrante());
		
		if (localizacao.eIgual(localizacao2)){
			System.out.print("Os dois pontos são diferentes");
		}else {
			System.out.print("Os dois pontos são iguais");
		}
		input.close();
		
	
	}

}
