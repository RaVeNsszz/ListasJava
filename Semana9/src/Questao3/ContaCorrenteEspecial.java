package Questao3;

public class ContaCorrenteEspecial extends ContaCorrente {
	
	public void contaCorrenteEspecial(String novoTitular, String novoNumeroDaConta,float novoSaldo) {
		setTitular(novoTitular);
		setNumeroDaConta(novoNumeroDaConta);
		setSaldo( novoSaldo);
	}
	public void sacarQuantia(float saque) {
		float total = (float)(getSaldo() - saque - 0.5);
		setSaldo(total);

	}
}
