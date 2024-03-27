package Questao1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MainQuestao1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String opc = "";
		ArrayList<String> array = new ArrayList<String>();
		do {
			opc = JOptionPane.showInputDialog(null, "Digite um nome: ");
			array.add(opc);
		} while (!opc.equals("fim"));
		
		int index = Integer.parseInt(JOptionPane.showInputDialog(null, array));
		int count = 0;
		for(String a: array) {
			if(a.equals(array.get(index))) {
				count++;
			}
		}
		JOptionPane.showMessageDialog(null,"Vezes que o nome foi escrito: "+count);
	}
}
