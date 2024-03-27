package CompanhiaAerea;
import java.util.Scanner;
public class Programa {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Cliente[] clientes = new Cliente[2];
		//Cliente cliente = null;
		
		for (int i = 0; i < clientes.length; i++) {
			Cliente cliente = null;
			System.out.println("Tipos de serviço:\nVIP \nComum");
			String tipo = input.nextLine();
			if (tipo.equals("vip")) {
				cliente = new ClienteVip();
			} else {
				cliente = new Cliente();
			}
			System.out.println("Nome: ");
			cliente.setNome(input.nextLine());
			System.out.println("CPF: ");
			cliente.setCPF(input.nextLine());
			clientes[i] = cliente;
		}
		System.out.println("Informe seu CPF: ");
		String cpf = input.nextLine();

		for (Cliente pessoa : clientes) {
			if (cpf.equals(pessoa.getCPF())) {
				if (pessoa instanceof ClienteVip) {
					System.out.println(1000 - (1000 * 0.35));
					
				}else
					System.out.println(1000);
			}
		}
	}
}
