package Questao2;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Paises {
	public void escolhaPais(Object index) {
		if(index.equals("Brasil")) {
			FabricaJOptionPane.criarMsg("Olá Mundo",new ImageIcon("img/icons8-brasil-48.png"));
		}
		else if(index.equals("EUA")) {
			FabricaJOptionPane.criarMsg("Hello World", new ImageIcon("img/icons8-usa-48.png"));
		}
		else if(index.equals("Espanha")) {
			FabricaJOptionPane.criarMsg("Hola Mundo", new ImageIcon("img/icons8-spain-48.png"));
		}else if(index.equals("Italia")) {
			FabricaJOptionPane.criarMsg("Ciao Mondo", new ImageIcon("img/icons8-italy-48.png"));
		}else {
			FabricaJOptionPane.criarMsg("Bonjour le Monde", new ImageIcon("img/icons8-france-48.png"));
		}
	}
	public static void main(String[] args) {
		Paises pais = new Paises();
		
		String[] vetor = { "Brasil", "EUA", "Espanha", "Italia", "Franca" };
//		String index = JOptionPane.showInputDialog(null,array);
//		pais.escolhaPais(index);
//		
//		
		Object objeto = JOptionPane.showInputDialog(null, "Selecione um Pais", "Paises", JOptionPane.QUESTION_MESSAGE,null, vetor, vetor[0]);
		pais.escolhaPais(objeto);
	
	}

}
