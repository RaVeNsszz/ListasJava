package Questao2;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class FabricaJOptionPane {
	
	public static String criarInput(String msg) {
        String str = JOptionPane.showInputDialog(msg);
        return str;
    }
	
	public static void criarMsg(String msg, Icon icon) {
        JOptionPane.showMessageDialog(null, msg, msg, 0, icon);
    }
}
