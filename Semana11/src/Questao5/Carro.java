package Questao5;

public abstract class Carro {
	private String modelo;
	private float preco;
	
	public Carro(float novoPreco) {
		preco = novoPreco;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
