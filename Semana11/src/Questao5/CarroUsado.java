package Questao5;

public class CarroUsado extends Carro {
	private float percentualDesconto;
	
	public CarroUsado(float novoPreco,float percentual) {
		super(novoPreco);percentualDesconto = percentual;
	}
	public String toString() {
		return "Tipo: Novo \nPreco:"+getPreco();
	}
	public float getPreco() {
		return super.getPreco()-(super.getPreco()*percentualDesconto);
	}
	public float getPercentualDesconto() {
		return percentualDesconto;
	}
	public void setPercentualDesconto(float percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	
}
