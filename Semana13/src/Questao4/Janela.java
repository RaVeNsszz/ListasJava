package Questao4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Janela extends JFrame {

	public Janela() {

		JLabel label = new JLabel(new ImageIcon("img/senha.png"));
		JLabel nome = new JLabel("Nome: ");
		JLabel senha = new JLabel("Senha: ");
		JTextField txtNome = new JTextField();
		JTextField txtSenha = new JTextField();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (Exception e) {

			System.out.println("Não foi possível alterar a L&F");

		}

		setLayout(new FlowLayout());

		setTitle("Cadastro de Clientes - Acesso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 250);
		label.setBounds(90, 80, 80, 80);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.GRAY);
		botao();

		txtNome.setBounds(250, 47, 130, 20);
		txtSenha.setBounds(250, 94, 130, 20);

		nome.setBounds(200, 40, 400, 30);
		senha.setBounds(200, 90, 400, 30);
		senha.setForeground(Color.red);

		add(txtSenha);
		add(txtNome);
		add(senha);
		add(nome);
		add(label);

		setVisible(true);

	}

	public void botao() {
		JButton botao = new JButton("Entrar");
		botao.setBackground(getForeground());
		botao.setForeground(Color.green);
		botao.setFont(new Font("Arial", Font.BOLD, 20));
		botao.setBounds(265, 130, 100, 25);
		add(botao);
	}

	public static void main(String[] args) {
		Janela janela = new Janela();
	}
}
