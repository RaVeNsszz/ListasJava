package LanceODado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class Swing extends JFrame {

	JLabel label = new JLabel(new ImageIcon(""));
	SpinnerModel model = new SpinnerNumberModel(1, 1, 6, 1);
	JSpinner js = new JSpinner(model);

	public Swing() {
		setTitle("Janela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		botao();
		label.setBounds(150, 100, 80, 80);
		add(label);
		jSpinner();
		setLocationRelativeTo(null);
		setSize(450, 300);

		setBackground(Color.BLACK);
		setVisible(true);
	}
	public void botao() {
		OuvinteBotaoJogar ouvinte = new OuvinteBotaoJogar(this);
		JButton jb = new JButton("Jogar");
		jb.addActionListener(ouvinte);
		jb.setBounds(80, 30, 70, 40);
		add(jb);
	}
	public void jSpinner() {
		js.setBounds(30, 30, 50, 50);
		js.setModel(model);
		add(js);
	}
	public class OuvinteBotaoJogar implements ActionListener {

		private Swing tela;

		public OuvinteBotaoJogar(Swing tela) {
			this.tela = tela;

		}
		public void actionPerformed(ActionEvent e) {
			Object componente = e.getSource();
			int sort = ((int) (1 + Math.random() * (6 - 1 + 1)));
			int msg = 0;
			while (msg != JOptionPane.NO_OPTION) {
				if ((int) js.getValue() == sort) {
					if (sort == 1) {
						label.setIcon(Imagens.UM);
					}
					if (sort == 2) {
						label.setIcon(Imagens.DOIS);
					}
					if (sort == 3) {
						label.setIcon(Imagens.TRES);
					}
					if (sort == 4) {
						label.setIcon(Imagens.QUATRO);
					}
					if (sort == 5) {
						label.setIcon(Imagens.CINCO);
					}
					if (sort == 6) {
						label.setIcon(Imagens.SEIS);
					}
				} else {
					msg = JOptionPane.showConfirmDialog(null, "Quer jogar de novo?");
					if (msg == JOptionPane.NO_OPTION) {

						System.exit(0);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Swing s = new Swing();
	}

}
