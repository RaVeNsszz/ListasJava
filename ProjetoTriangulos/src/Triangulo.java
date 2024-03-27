
public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public void setLado1(int lado) {
		lado1 = lado;
	}
	public int getLado1() {
		return lado1;
	}
	
	public void setLado2(int lado) {
		lado2 = lado;
	}
	public int getLado2() {
		return lado2;
	}
	
	public void setLado3(int lado) {
		lado3 = lado;
	}
	public int getLado3() {
		return lado3;
	}
	
	
	public TiposDeTriangulo tipo() {
		if(lado1 == lado2 && lado2 == lado3) {
			return TiposDeTriangulo.Equilatero;
		}else if(lado1 == lado2 || lado1 == lado3||lado2 == lado3) {
			return TiposDeTriangulo.Isosceles;
		}else {
			return TiposDeTriangulo.Escaleno;
		}
	
	}

}
