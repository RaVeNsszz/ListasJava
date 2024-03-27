package FormataçãoDeTexTo;

public class Invertida extends FormatacaoTexto {

	public String formatarTexto(String texto) {
		return new StringBuilder(texto).reverse().toString();
}	}

