package Questao123;

public class Criptografia extends Decorador{
	
	public String getTexto() {	
		return texto.replace(" ", "*");
	}

}
