package Questao2;

import java.util.ArrayList;

public class ChatBotNetflix extends Chat {
	private ArrayList<String> programas;
	public void seApresentar() {
		System.out.println("Olá, eu sou, Neta, a atendente da Netflix ");
	}
	public void indentificar() {
		System.out.println("Qual seu email? ");
		System.out.println("Qual sua senha? ");
	}
	public void opcoesAtendimento() {
		System.out.println("Esses são os programas da sua lista");
		System.out.println(programas.toString());
	}

}
