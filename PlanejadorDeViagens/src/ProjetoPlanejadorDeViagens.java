import java.util.Scanner;
public class ProjetoPlanejadorDeViagens {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Carro carro = new Carro();
		Planejador planejador = new Planejador();
		
		System.out.println("Modelo: ");
		carro.setModelo(input.nextLine());
		
		System.out.println("Autonomia: ");
		carro.setAutonomia(input.nextFloat());
		
		System.out.println("Capacidade do Tanque: ");
		carro.setCapacidadeDoTanque(input.nextInt());
		
		System.out.println("Distância até o Destino: ");
		int distancia = input.nextInt();
		
		System.out.println("Reabastecimentos necessários: "+planejador.estimarAbastecimento(carro, distancia));
		input.close();
	}

}
