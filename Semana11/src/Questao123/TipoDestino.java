package Questao123;

public enum TipoDestino {
	
	INTERNO(1), EXTERNO(2);

	private int destino;

	private TipoDestino(int destino) {
		this.destino = destino;
	}

	public int getDestino() {
		return destino;

	}

}
