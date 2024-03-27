 package ImpressoraOO;
public class Impressora {
	
	private int qtdPaginas;
	private float cargaToner;
	private int qtdFolhasImpressas;
		
	public Impressora() {
		qtdPaginas = 0;
		cargaToner = 10;
	}
	
	public int imprimir(int paginas) throws FaltouPapelException,
	FaltouTintaException{
		for(int i = 0;i < paginas;i++) {
			if (getCargaToner() > 0.35 && getQtdPaginas() > 0) {
				setQtdPaginas(getQtdPaginas()-1);
				setQtdFolhasImpressas(getQtdFolhasImpressas()+1);
				
			}else if(getQtdPaginas()<=0){
				throw new FaltouPapelException(paginas-i);
				
			}if(getCargaToner() < 0.35) {
				throw new FaltouTintaException(paginas-i);
			}	
			setCargaToner((float)(getCargaToner()-0.35));
		}
		return getQtdFolhasImpressas();
	}


	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public float getCargaToner() {
		return cargaToner;
	}

	public void setCargaToner(float cargaToner) {
		this.cargaToner = cargaToner;
	}

	public int getQtdFolhasImpressas() {
		return qtdFolhasImpressas;
	}
	public void setQtdFolhasImpressas(int qtdFolhasImpressas) {
		this.qtdFolhasImpressas = qtdFolhasImpressas;
	}
}
