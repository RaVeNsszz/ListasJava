package Questao4;

public abstract class OperecaoMatematica {
	private int operacao1;
	private int operacao2;
	//retorna o resultado da operação matematica
	public abstract float retornarResultado();
	//deve imprimir o resultado no console
	public  void imprimirResultado() {
		System.out.println(retornarResultado());
	}
	
	public void setOperacao1(int novaOperacao) {
		operacao1 = novaOperacao;
	}
	public int getOperacao1() {
		return operacao1;
	}
	public void setOperacao2(int novaOperacao) {
		operacao2 = novaOperacao;
	}
	public int getOperacao2() {
		return operacao2;
	}


}
