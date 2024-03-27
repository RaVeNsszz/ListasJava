package ImpressoraOO;

public class FaltouTintaException extends Exception {
	private int folhasNaoImpressas;
	
	public String getMessage() {
		return "Faltou tinta, e ainda faltam "+getFolhasNaoImpressas()+" folhas à serem impressas";
	}
	public FaltouTintaException(int folhas) {
		folhasNaoImpressas = folhas;
	}
	public int getFolhasNaoImpressas() {
		return folhasNaoImpressas;
	}
	public void setFolhasNaoImpressas(int folhasNaoImpressas) {
		this.folhasNaoImpressas = folhasNaoImpressas;
	}
}
