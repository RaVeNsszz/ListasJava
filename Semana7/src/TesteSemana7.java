import java.util.Scanner;
public class TesteSemana7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa[] cadastro = new Pessoa[3];
		
		int erro = 0;
		int casados = 0;
		int solteiros = 0;
		int outros = 0;
		int total = 0;
		
		do {
			Pessoa pessoa = new Pessoa();
			System.out.println("Nome: ");
			pessoa.setNome(input.nextLine());			
			System.out.println("Estado Civil: ");
			pessoa.setEstadoCivil(EstadoCivil.valueOf(input.nextLine().toUpperCase()));			
			System.out.println("Idade: ");
			pessoa.setIdade(Integer.parseInt(input.nextLine()));			
			int errosAntes = erro;
			int parcial = solteiros + casados + outros;			
			for (int j = 0; j < parcial; j++) {	
				if(cadastro[j].equals(pessoa)){
					erro++;
					System.out.println("Esse usuário ja consta no sistema, add outra pessoa!");
					break;
				}
			}			
			if (errosAntes == erro) {
				cadastro[total]= pessoa;				
				if (pessoa.getEstadoCivil()== EstadoCivil.SOLTEIRO) {
					solteiros++;					
				}else if(pessoa.getEstadoCivil()== EstadoCivil.CASADO){
					casados++;
				}else {
					outros++;
				}
				//System.out.println(cadastro[total].toString(pessoa));
				total++;
			}
		}while(total<3);
		for (Pessoa p : cadastro) {
			System.out.println(p.toString());
		}
	
		System.out.println("RELATÓRIO");
		System.out.println("Quantidade de Solteiros: "+solteiros+"\nQuantidade de Casados: "+casados);
		System.out.println("Quantidade de Erros durante o cadastro: "+erro);
		input.close();
	}
}
