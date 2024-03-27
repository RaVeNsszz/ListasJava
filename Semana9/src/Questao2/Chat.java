package Questao2;

import java.time.LocalDateTime;

public abstract class Chat {
	
	public void saudar() {
		String[] msg = {"Boa Madrugada","Bom Dia" ,"Boa Tarde","Boa Noite"};
		int hora = LocalDateTime.now().getHour();
		System.out.println(msg[hora/6]);
	}
	public abstract void seApresentar();
	public abstract void indentificar();
	public abstract void opcoesAtendimento();
	
	public void iniciarAtendimento() {
		saudar();
		seApresentar();
		indentificar();
		opcoesAtendimento();
		
	}
}
