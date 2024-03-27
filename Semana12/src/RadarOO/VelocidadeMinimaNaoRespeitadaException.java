package RadarOO;

public class VelocidadeMinimaNaoRespeitadaException extends Exception {
	
	private float multa;
	
	public VelocidadeMinimaNaoRespeitadaException(float novaMulta) {
		multa = novaMulta;
	}
	public String getMessage() {
		return "Velacidade Mínima não respeitada, multa de "+getMulta();
	}
	public float getMulta() {
		return multa;
	}
	public void setMulta(float multa) {
		this.multa = multa;
	}
	
}
