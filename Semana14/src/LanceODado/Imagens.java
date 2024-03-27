package LanceODado;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Imagens {

	private static Icon importarImagem(String caminho) {
		ImageIcon icone = new ImageIcon(caminho);
		return icone;
	}

	public static final ImageIcon UM = (ImageIcon) Imagens.importarImagem("img/um.jpg");
	public static final ImageIcon DOIS = (ImageIcon) Imagens.importarImagem("img/dois.jpg");
	public static final ImageIcon TRES = (ImageIcon) Imagens.importarImagem("img/três.jpg");
	public static final ImageIcon QUATRO = (ImageIcon) Imagens.importarImagem("img/quatro.jpg");
	public static final ImageIcon CINCO = (ImageIcon) Imagens.importarImagem("img/cinco.jpg");
	public static final ImageIcon SEIS = (ImageIcon) Imagens.importarImagem("img/seis.jpg");

}
