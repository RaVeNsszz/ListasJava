package RadarOO;

public class VelocidadeMaximaNaoRespeitadaException extends Exception{
	private float multa;
	
	public VelocidadeMaximaNaoRespeitadaException(float novaMulta) {
		multa = novaMulta;
	}
	public String getMessage() {
		return "Velacidade Máxima não respeitada, multa de "+getMulta();
	}
	public float getMulta() {
		return multa;
	}
	public void setMulta(float multa) {
		this.multa = multa;
	}
}
