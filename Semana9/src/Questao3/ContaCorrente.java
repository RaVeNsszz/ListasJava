package Questao3;

public  class ContaCorrente {
	private String titular;
	private String numeroDaConta;
	private float saldo;
	
	public void contaCorrente(String novoTitular, String novoNumeroDaConta,float novoSaldo) {
		titular = novoTitular;
		numeroDaConta = novoNumeroDaConta;
		saldo = novoSaldo;
	}
	
	public  void depositar(float deposito) {
		saldo += deposito;
	}
	
	public void sacarQuantia(float saque) {
		//float total = getSaldo() - 1;
		setSaldo(getSaldo() - saque -1);
	}
	public float obterSaldo() {
		return saldo;
	}
	public void setNumeroDaConta(String novoNumero) {
		numeroDaConta = novoNumero;
	}
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setTitular(String novoTitular) {
		titular = novoTitular;
	}
	public String getTitular() {
		return titular;
	}
	public void setSaldo(float novoSaldo) {
		saldo = novoSaldo;
	}
	protected float getSaldo() {
		return saldo;
	}
	
	

}
