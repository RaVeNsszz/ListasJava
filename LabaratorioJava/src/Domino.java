
public class Domino {
	private int ladoA;
	private int ladoB;

	public String toString() {
		int a = ladoA;
		int b = ladoB;
		return "[" + a + "," + b + "]";

	}

	public boolean validarJuncao(Domino peca) {
		return ladoA == peca.ladoA || ladoA == peca.ladoB || ladoB == peca.ladoB;
	}

	public Domino(int ladoA, int ladoB) {
		if (ladoA < 0 && ladoA >= 6 && ladoB < 0 && ladoB >= 6) {
			this.ladoA = 0;
			this.ladoB = 0;
		} else {
			this.ladoA = ladoA;
			this.ladoB = ladoB;
		}
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		if (ladoA < 0 && ladoA >= 6) {
			this.ladoA = 0;
		} else
			this.ladoA = ladoA;

	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		if (ladoB < 0 && ladoB >= 6) {
			this.ladoB = 0;
		} else
			this.ladoB = ladoB;
	}

}
