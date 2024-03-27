package ProjetoSolucionadorDeEquaçõesDoSegundoGrau;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaSegundoGrau extends JFrame {
	JTextField txtA;
	JTextField txtB;
	JTextField txtC;
	double x1;
	double x2;
	JLabel label4;
	JLabel label5;

	public JanelaSegundoGrau() {

		setTitle("Janela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(400, 200);
		setBackground(Color.BLUE);
		campoDeTexto();
		label();
		botao();
		setVisible(true);

	}

	public void botao() {
		OuvinteRaiz ouvinte = new OuvinteRaiz(this);
		JButton btn = new JButton("Raizes");
		btn.setBounds(250, 30, 100, 30);
		add(btn);
		btn.addActionListener(ouvinte);
	}

	public void label() {
		JLabel label1 = new JLabel("x² +");
		JLabel label2 = new JLabel("x +");
		JLabel label3 = new JLabel("= 0");
		label4 = new JLabel();
		label5 = new JLabel();
		label1.setBounds(70, 35, 30, 20);
		label1.setForeground(Color.BLACK);
		label2.setBounds(135, 30, 30, 30);
		label2.setForeground(Color.BLACK);
		label3.setBounds(190, 30, 30, 30);
		label3.setForeground(Color.BLACK);

		label4.setBounds(150, 70, 80, 30);
		label4.setForeground(Color.BLACK);
		label5.setBounds(150, 100, 80, 30);
		label5.setForeground(Color.BLACK);
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
	}

	public void campoDeTexto() {
		txtA = new JTextField();
		txtB = new JTextField();
		txtC = new JTextField();
		txtA.setBounds(30, 30, 30, 30);
		txtB.setBounds(100, 30, 30, 30);
		txtC.setBounds(160, 30, 30, 30);
		add(txtA);
		add(txtB);
		add(txtC);
	}

	public class OuvinteRaiz implements ActionListener {

		private JanelaSegundoGrau janela;

		public OuvinteRaiz(JanelaSegundoGrau janela) {
			this.janela = janela;

		}

		public void actionPerformed(ActionEvent e) {
			Object componente = e.getSource();
			try {
				x1 = EquacaoSegundoGrau.getX(Integer.parseInt(txtA.getText()), Integer.parseInt(txtB.getText()),
						Integer.parseInt(txtC.getText()), true);
				x2 = EquacaoSegundoGrau.getX(Integer.parseInt(txtA.getText()), Integer.parseInt(txtB.getText()),
						Integer.parseInt(txtC.getText()), false);
				System.out.println(x1);
				label4.setText("x1 = " + x1);
				label5.setText("x2 = " + x2);
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			} catch (NaoHaSolucaoRealException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}

		}

	}

	public static void main(String[] args) {
		JanelaSegundoGrau j = new JanelaSegundoGrau();
	}
}
