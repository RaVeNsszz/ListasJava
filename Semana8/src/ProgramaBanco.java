import java.util.Scanner;
public class ProgramaBanco {
	public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
		ContaCorrente[] corrente = new ContaCorrente[5];
		ContaPoupanca[] poupanca = new ContaPoupanca[5];
		
		int countP = 0; int countC = 0 ; int limite = 0; int tipo = 0;
		float saldo = 0;
		String titular = "";
		String numero = "";
		float  chequeEspecial = 0;
		float taxaDeRendimento = 0;
		
		do {
			int erros = 0;
			System.out.println("CADASTRO");
			System.out.println("Tipo da conta  CORRENTE(1) ou POUPANCA(2): ");
		 	tipo = Integer.parseInt(input.nextLine());
			if(tipo == 1) {
				System.out.println("Saldo: ");
				saldo = Float.parseFloat(input.nextLine());
				System.out.println("Titular: ");
				titular = input.nextLine();
				System.out.println("Numero: ");
				numero = input.nextLine();
				System.out.println("Cheque Especial: ");
				chequeEspecial = Float.parseFloat(input.nextLine());
				ContaCorrente  p = new ContaCorrente(saldo,titular,numero,chequeEspecial);
				for (int j = 0; j < countC; j++) {	
					if(corrente[j].equals(p)){
						System.out.println("Esse usuário ja consta no sistema, add outra pessoa!");
						erros = 1;break;
					}
				}
				if (erros != 1) {
					corrente[countC]=p;
					countC++;	
				}
				
				
			}else if(tipo == 2) {
				System.out.println("Saldo: ");
				saldo = Float.parseFloat(input.nextLine());
				System.out.println("Titular: ");
				titular = input.nextLine();
				System.out.println("Numero: ");
				numero = input.nextLine();
				System.out.println("Taxa de Rendimento: ");
				taxaDeRendimento = Float.parseFloat(input.nextLine());
				ContaPoupanca  p = new ContaPoupanca(saldo,titular,numero,taxaDeRendimento);
				for (int j = 0; j < countP; j++) {	
					if(poupanca[j].equals(p)){
						System.out.println("Esse usuário ja consta no sistema, add outra pessoa!");
						erros = 1;
						break;
					}
				}if (erros != 1) {
					poupanca[countP] = p;
					countP++;
				}
			}else {
				System.out.println("Tipo Inexistente!!!");
			}
			limite = countP+countC;
		
			
		}while(limite != 5);
		 
		System.out.println("Quantidade de Contas Correntes cadastradas: "+countC);
		System.out.println("Quantidade de Contas Poupanças cadastradas: "+countP);
		
		for (ContaCorrente p:corrente) {	
			if (p==null) {
				break;
			}
			System.out.println(p.toString());
			
		}
		for(ContaPoupanca p: poupanca) {
			if (p==null) {
				break;
			}else {
				System.out.println(p.toString());
			}
			
		}
		input.close();
		
	} 

}
