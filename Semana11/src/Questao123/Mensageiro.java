package Questao123;

public class Mensageiro {
	public Mensagem prepararMensagem(String mensagemASerEnviada, int destino) {
		Mensagem mensagem = null;
		if (destino == TipoDestino.EXTERNO.getDestino()) {
			mensagem = new DireitosAutorais();
			mensagem.setTexto(mensagemASerEnviada);
			String comDireitosAutorais = mensagem.getTexto();
			mensagem = new Criptografia();
			mensagem.setTexto(comDireitosAutorais);
			return mensagem;
		} else {
			mensagem = new Mensagem();
			mensagem.setTexto(mensagemASerEnviada);
			return mensagem;
		}
	}
}
