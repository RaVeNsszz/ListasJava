package MudandoFundoDaTela;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Janela extends JFrame {
	private JComboBox<String> comboBox;

	public Janela() {
		setTitle("Mudança de Fundo da Janela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);

		// Criando o combobox
		String[] cores = { "Vermelho", "Verde", "Azul" };
		comboBox = new JComboBox<>(cores);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String corSelecionada = (String) comboBox.getSelectedItem();
				if (corSelecionada.equals("Vermelho")) {
					getContentPane().setBackground(Color.RED);
				} else if (corSelecionada.equals("Verde")) {
					getContentPane().setBackground(Color.GREEN);
				} else if (corSelecionada.equals("Azul")) {
					getContentPane().setBackground(Color.BLUE);
				}
			}
		});
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(comboBox);
	}

	public static void main(String[] args) {

		Janela janela = new Janela();
		janela.setVisible(true);
	}

}