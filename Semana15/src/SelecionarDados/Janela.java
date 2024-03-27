package SelecionarDados;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Janela extends JFrame{
	private int soma ;
	private JCheckBox checkBox10;
	private JCheckBox checkBox20;
	private JCheckBox checkBox30;
	private JCheckBox checkBox50;
	private JTextField txtResultado;
	
	
	private class OuvinteCheckBox implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			soma = 0;
		
			if (checkBox10.isSelected()) {
				soma+= 10;
			}
			if(checkBox20.isSelected()) {
				soma += 20;
			}
			if (checkBox30.isSelected()) {
				soma+= 30;
			}
			if (checkBox50.isSelected()) {
				soma+= 50;
			}
//			getTxtResultado().setText(String.valueOf(getSoma()));
		
			System.out.println(getSoma());
			getTxtResultado().setText("Jão vitor é um cagão");
			
		}	
	}
	public Janela() {
		setLayout(new FlowLayout());
		setTitle("CheckBox teste");
		setSize(500,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addCheckBox();
		addJTextField();
	
		setVisible(true);
	}
	public void addCheckBox() {
		checkBox10 = new JCheckBox("10");
		checkBox20 = new JCheckBox("20");
		checkBox30 = new JCheckBox("30");
		checkBox50 = new JCheckBox("50");
		
		add(checkBox10);
		add(checkBox20);
		add(checkBox30);
		add(checkBox50);
		OuvinteCheckBox ouvinte = new OuvinteCheckBox();
		checkBox10.addActionListener(ouvinte);
		checkBox20.addActionListener(ouvinte);
		checkBox30.addActionListener(ouvinte);
		checkBox50.addActionListener(ouvinte);
	}
	public void addJTextField() {
		JTextField txtResultado = new JTextField(getSoma());
		System.out.println(getSoma());
		txtResultado.setEnabled(false); // torna o campo ineditável
		add(txtResultado);	
	}
	
	
	public JTextField getTxtResultado() {
		return txtResultado;
	}
	public int getSoma() {
		return soma;
	}
	public JCheckBox getCheckBox10() {
		return checkBox10;
	}
	public JCheckBox getCheckBox20() {
		return checkBox20;
	}
	public JCheckBox getCheckBox30() {
		return checkBox30;
	}

	public static void main(String [] args) {
		new Janela();
	}  
}
