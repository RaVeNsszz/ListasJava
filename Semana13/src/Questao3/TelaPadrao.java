package Questao3;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class TelaPadrao {
	public TelaPadrao(String titulo) {
		JFrame janela = new JFrame();
		janela.setTitle(titulo);
		janela.setSize(400, 400);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		adicionarLabel(janela);
		//repaint();
	}
	public void adicionarLabel(JFrame frame) {
		JLabel texto = new JLabel("Meu primeiro Label",new ImageIcon("img/icons8-france-48.png"),JLabel.LEFT);
		texto.setBounds(0,200,200,0);
		texto.setFont(new Font("Arial",Font.BOLD,16));
		texto.setForeground(Color.BLUE);
		texto.setToolTipText("Dica");
		
		frame.add(texto);
	}
}
