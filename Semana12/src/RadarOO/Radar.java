package RadarOO;

public class Radar {
	private float velocidadeMaxima;
	//private float multa;
	
	public Radar() {
		velocidadeMaxima = 90;
	}
	public void verificarVelocidade(Veiculo veiculo)throws VelocidadeMaximaNaoRespeitadaException,VelocidadeMinimaNaoRespeitadaException{
		Multa multa = new Multa(veiculo,0);
		if (veiculo.getVelocidadeAtual()>getVelocidadeMaxima()) {
			float velocidade = veiculo.getVelocidadeAtual();
			if (velocidade <= (float)(getVelocidadeMaxima()+(getVelocidadeMaxima()*0.20))){
				multa.setValorMulta((float) 85.13);	
			}else if(velocidade <= (float)(getVelocidadeMaxima()+(getVelocidadeMaxima()*0.50))) {
				multa.setValorMulta((float) 127.53);
			}else
				multa.setValorMulta((float) 574.62);
			throw new VelocidadeMaximaNaoRespeitadaException(multa.getValorMulta());
		}
		if(veiculo.getVelocidadeAtual() < (float)(getVelocidadeMaxima()*0.50)){
			multa.setValorMulta((float) 87.33);
			throw new VelocidadeMinimaNaoRespeitadaException(multa.getValorMulta());	
		}
	}
	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}
