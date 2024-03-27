package ProjetoJogoForca;

public class JogaDaForca {
	private Palavra[] dicionario = new Palavra[15];
	private int posicaoSort;
	private String gabarito;
	
	public String palavraSorteada() {
		return dicionario[posicaoSort].getPalavra();
	}
	public boolean testarSeAcabou() {
		if (dicionario[posicaoSort].getPalavra().equals(gabarito)) {
			dicionario[posicaoSort] = null;
			posicaoSort = -1;
			return true;
		}
		return false;
	}
	public boolean testarLetra(char c) {
		String gabaritoAntigo = gabarito;
		char[] listaChar = gabarito.toCharArray();
		for (int i = 0;i<dicionario[posicaoSort].getPalavra().length();i++) {
			char letraResposta = dicionario[posicaoSort].getPalavra().charAt(i);
			if (c==letraResposta) {
				listaChar[i] = letraResposta;
				gabarito = new String(listaChar);
				return true;
			}else {
				gabarito = new String(listaChar);
			}
		}
		return !gabaritoAntigo.equals(gabarito);
	}
	
	public void sortear () {
		int sorteado = 0;
		String tamanho = "";
		do {
			sorteado = (int) (Math.random()*(dicionario.length));
			if (dicionario[sorteado]!=null) {
				posicaoSort = sorteado;
				for (int i = 0;i<dicionario[sorteado].getPalavra().length();i++) {
					tamanho+="?";
				}
			}		
		}while(dicionario[sorteado]==null);
		gabarito = tamanho;
	}
	public String pegarDica() {
		if (dicionario[posicaoSort].getDica()== null) {
			System.out.println("Sem dica nessa posição");
		}
		return dicionario[posicaoSort].getDica();
	}
	
	public void setDicionario(Palavra[] d) {
		dicionario = d;	
	}	
	
	public Palavra[] getDicionario() {
		return dicionario;
	}
	
	public int getPosicaoSort() {
		return posicaoSort;
	}
	public String getGabarito() {
		return gabarito;
	}

}
