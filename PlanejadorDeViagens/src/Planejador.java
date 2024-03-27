
public class Planejador {
	
	public int estimarAbastecimento(Carro carro, int distancia) {
		float litros = distancia/carro.getAutonomia();// calcular a o destino pela autonomia do carro
		float resultado = (litros/carro.getCapacidadeDoTanque()); // reabastecimento necessário
		return (int) Math.ceil(resultado); // arendodar pra cima		
	}
}

