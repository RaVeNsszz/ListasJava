package JogoDaVelha;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class JogoDaVelha extends JFrame{
	
	public JogoDaVelha() {
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setResizable(false);
		setLocationRelativeTo(null);
		addBottons();
		setVisible(true);
	}
	private void addBottons() {
		setLayout(new GridLayout(3,3));
		JButton botao1 = new JButton(" ");
		botao1.setPreferredSize(new Dimension(10,10));
		add(botao1);
		JButton botao2 = new JButton(" ");
		botao2.setPreferredSize(new Dimension(10,10));
		add(botao2);
		JButton botao3 = new JButton(" ");botao3.setLayout(new FlowLayout());
		botao3.setPreferredSize(new Dimension(10,10));
		add(botao3);
		JButton botao4 = new JButton(" ");
		botao4.setPreferredSize(new Dimension(10,10));
		add(botao4);
		JButton botao5 = new JButton(" ");
		botao5.setPreferredSize(new Dimension(10,10));
		add(botao5);
		JButton botao6 = new JButton(" ");
		botao6.setPreferredSize(new Dimension(10,10));
		add(botao6);
		JButton botao7 = new JButton(" ");
		botao7.setPreferredSize(new Dimension(10,10));
		add(botao7);
		JButton botao8 = new JButton(" ");
		botao8.setPreferredSize(new Dimension(10,10));
		add(botao8);
		JButton botao9 = new JButton(" ");
		botao9.setPreferredSize(new Dimension(10,10));
		add(botao9);
		JButton BotaoNovoJogo = new JButton();
		BotaoNovoJogo.setPreferredSize(new Dimension(10,10));
		//add(BotaoNovoJogo,BorderLayout.SOUTH);
		
//		OuvinteBotoes ouvinte = new OuvinteBotoes(new );
		
		// X O infinito
	}

	public static void main(String [] args ) {
		new JogoDaVelha();
	}

}
