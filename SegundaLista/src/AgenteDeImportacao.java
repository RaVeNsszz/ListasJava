
public class AgenteDeImportacao {
	
	public float converter(ProdutoImportado produto){//produto = dolar
		// metodo publico; tipo float; nome do metodo; (tipo variavel);
		return (float)(produto.getPreco() * 5.18);		// casting "float"
	}
	
	public float calcularImposto (ProdutoImportado produto ) {	
		return (float)(converter(produto) * 0.60); //mandando converter em real e multiplicar pelo imposto
	}

}
