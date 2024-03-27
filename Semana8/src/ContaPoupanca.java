
public class ContaPoupanca {
	private float saldo;
	private String titular;
	String numero;
	private float taxaDeRendimento;
	
	public ContaPoupanca(float s,String t,String n,float taxa) {
		saldo = s;
		titular = t;
		numero = n;
		taxaDeRendimento = taxa;
	}
	public String toString() {
		return "Tipo da Conta: Poupança\nNúmero da Conta: "+numero+"\nSaldo: "+saldo;
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
	public void setTaxaDeRendimento(float taxa) {
		taxaDeRendimento = taxa;
	}
	public float getTaxaDeRendimento() {
		return taxaDeRendimento;
	}

}
