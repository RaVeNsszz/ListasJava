package ImpressoraOO;

public class FaltouPapelException extends Exception {
	private int folhasNaoImpressas;
	
	public String getMessage() {
		return "Não tem Papel, e faltam "+folhasNaoImpressas+" folhas a serem impressas";
	}	
	public FaltouPapelException(int folhas) {
		folhasNaoImpressas = folhas;
	}
	public int getFolhasNaoImpressas() {
		return folhasNaoImpressas;
	}
	public void setFolhasNaoImpressas(int folhasNaoImpressas) {
		this.folhasNaoImpressas = folhasNaoImpressas;
	}
}
