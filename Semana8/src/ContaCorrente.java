
public class ContaCorrente {
	private float saldo;
	private String titular;
	private String numero;
	private float chequeEspecial;
	
	public ContaCorrente(float s,String t,String n,float c) {
		saldo = s;
		titular = t;
		numero = n;
		chequeEspecial = c;
	}
	public String toString() {
		return "Tipo da Conta: Corrente\nNúmero da Conta: "+numero+"\nSaldo: "+saldo;
	}
	public boolean equals(ContaPoupanca p) {
		if (p.getNumero().equals(p.numero)) {
			return true;
		}
		return false;
	}
	
	public void setSaldo(Float s) {
		saldo = s;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setTitular(String t) {
		titular = t;
	}
	public String getTitular() {
		return titular;
	}
	public void setNumero(String n) {
		numero = n;
	} 
	public String getNumero() {
		return numero;
	}
	public void setChequeEspecial(float cheque) {
		chequeEspecial = cheque;
	}
	public float getTaxaDeRendimento() {
		return chequeEspecial;
	}


}
