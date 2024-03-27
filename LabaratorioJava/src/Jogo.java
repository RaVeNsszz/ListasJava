
public class Jogo {
	private Domino[] arrayJogo = new Domino[28];
	private int indiceDaPecaASerPuxada = 0;
	private int pontaAtivaDaEsquerda = -1;
	private int pontaAtivaDaDireita = -1;
	
	public static boolean testeSeAcabou(Domino[] array) {
		
	
		return false;
	}
	
	public boolean conectarAPontaEsquerda(Domino peca) {
		
		if (pontaAtivaDaEsquerda == -1 || pontaAtivaDaDireita == -1) {
			pontaAtivaDaEsquerda = peca.getLadoA();
			pontaAtivaDaDireita = peca.getLadoB();
			return true;
		}else if (pontaAtivaDaEsquerda == peca.getLadoA()|| pontaAtivaDaEsquerda == peca.getLadoB()){
			return true;
		}
		return false;
	}
	public boolean conectarAPontaDireita(Domino peca) {
		if (pontaAtivaDaEsquerda == -1 || pontaAtivaDaDireita == -1) {
			pontaAtivaDaEsquerda = peca.getLadoA();
			pontaAtivaDaDireita = peca.getLadoB();
			return true;
		}else if (pontaAtivaDaDireita == peca.getLadoA()|| pontaAtivaDaDireita == peca.getLadoB()){
			return true;
		}
		return false;
		
	}
	
	public int getPontaAtidaDaEsquerda() {
		return pontaAtivaDaEsquerda;
	}
	public int getPontaAtidaDaDireita() {
		return pontaAtivaDaDireita;	
	}
	
	
	public Domino puxarPeca() {
		if(indiceDaPecaASerPuxada >= 28) {
			return null;
		}
		return arrayJogo[indiceDaPecaASerPuxada++];
	}

	public void embaralharPecas() {
		for(int i = 0; i < 100; i++ ) {
			int num1 = (int) (Math.random()*28);
			int num2 = (int) (Math.random()*28);
			Domino aux = arrayJogo[num1];
			arrayJogo[num1]= arrayJogo[num2];
			arrayJogo[num2]=aux;
		}
		
		indiceDaPecaASerPuxada=0;
		pontaAtivaDaEsquerda=-1;
		pontaAtivaDaDireita=-1;
		
		
		
	}
	public void jogo() {

		for (int i = 0; i <= 6; i++) {
			for (int j = i; i <= 6; j++) {
				arrayJogo[i] = new Domino(i, j);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.jogo();
		for(Domino domino: jogo.arrayJogo) {
			System.out.println(domino);
		}
	}
}
