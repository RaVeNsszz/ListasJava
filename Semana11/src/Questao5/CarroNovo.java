package Questao5;

public class CarroNovo extends Carro {
	private float percentualAcrescimo;
	
	public CarroNovo(float novoPreco, float percentual) {
		super(novoPreco);
		percentualAcrescimo = percentual;
	}
	public String toString() {
		return "Tipo: Novo \nPreco:"+getPreco();
	}
	public float getPreco() {
		return super.getPreco()+(super.getPreco()*percentualAcrescimo);
	}
	public float getPercentualDesconto() {
		return percentualAcrescimo;
	}
	public void setPercentualDesconto(float percentualAcrescimo) {
		this.percentualAcrescimo = percentualAcrescimo;
	}
	
}
