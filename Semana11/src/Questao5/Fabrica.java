package Questao5;

public class Fabrica {
	public static Carro fabrica(float preco, String tipo) {
		if (tipo.equals("NOVO")) {
			return new CarroNovo(preco,10f/100);
		}else if (tipo.equals("USADO")) {
			return new CarroUsado(preco,10f/100);
		}
		return null;
	}
}
