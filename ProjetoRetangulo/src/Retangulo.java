
public class Retangulo {
	//q7 lista 4
	private int base;
	private int altura;
	
	public void setBase(int novaBase) {
		base = novaBase;
	}
	public int getBase() {
		return base;
	}
	
	public void setAltura(int novaAltura) {
		altura = novaAltura;
	}
	public int getAltura() {
		return altura;
	}
	
	public int area(int setBase, int setAltura) {
		base = setBase;
		altura = setAltura;
		return (int)(base * altura); 
	}
	
	public int perimetro(int setBase, int setAltura) {
		return(int)((2*setBase)+(2*setAltura));
	}
	//q8 lista 4
	public boolean isQuadrado() {
		if (altura == base) {
			return false;
		}
		return true;
	}
	//q9 lista 4
	public void autodesenhar() {
		for(int linha = 0;linha < altura;linha++) {
			for(int coluna = 0;coluna < base;coluna++) {
				System.out.print("O");
			}
			System.out.println("");
			
		}

	}
}
