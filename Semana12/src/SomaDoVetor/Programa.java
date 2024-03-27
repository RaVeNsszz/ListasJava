package SomaDoVetor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Programa {
	public static void main (String[] args) {
	//JOptionPane jp = new JOptionPane();
	//JOpcionPane.showMessageDialog(null,"Chamando");
	JFrame janela = new JFrame("Teste");

	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setTitle("Teste");
	janela.setSize(300,300);// tamahho da janela
	janela.setResizable(false);// valores booleanos para caso queira redimencionar(maximizar)
	janela.setLocationRelativeTo(null); // posiciona na tela
	janela.setLayout(null);//"apaga" as configurações feitas até agora, somos obrigados as definir onde o componete vai ser posicionado
	janela.add(new JButton ("Clique em mim!"));
	janela.setVisible(true);// tem  ser sempre o ultimo
	JLabel texto = new JLabel("TO DO LIST");
	texto.setBounds(200, 0,200 , 30);//1 e 2 = coordenadas x,y, comprimento, altura
	janela.add(texto);
	
	//int retorno = JOptionPane.showConfirmDialog(null, "Tudo Bem? ");
//	ImageIcon icone = new ImageIcon("icons8-brasil-48.png");
//		
	//String[] vetor = {"CASA","MANSÃO","CABANA","HOTEL","ACAMPAMENTO","MOTOHOMMER"};
//	Object objeto = JOptionPane.showInputDialog(null, "O que isso faz?", "Teste", JOptionPane.ERROR_MESSAGE,null, vetor, vetor[0]);
//	JOptionPane.showMessageDialog(null, objeto);
	
	
	//int indice = JOptionPane.showInternalOptionDialog(null, "O que isso faz?","Teste", JOptionPane.YES_NO_CANCEL_OPTION,
		//	JOptionPane.INFORMATION_MESSAGE, null, vetor, vetor[0]);
	//System.out.println(vetor[indice]);	
	}
}
