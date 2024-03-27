
public class Carro {
	private String modelo;
	private float autonomia;
	private int capacidadeDoTanque;
	
	public void setModelo(String novoModelo) {
		modelo = novoModelo;
	}
	public String getModelo() {
		return modelo;
	}

	public void setAutonomia(float novaAutonomia) {
		autonomia = novaAutonomia;
	}
	public float getAutonomia() {
		return autonomia;
	}
	
	public void setCapacidadeDoTanque(int novaCapacidadeDoTanque) {
		capacidadeDoTanque = novaCapacidadeDoTanque;
	}
	public int getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

}
