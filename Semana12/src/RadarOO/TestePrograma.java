package RadarOO;
import java.util.Scanner;
public class TestePrograma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Radar radar = new Radar();
		//Scanner input = new Scanner(System.in);
		Veiculo[] veiculos = new Veiculo[3];
		Multa centralDeMultas = new Multa(null,0);
		int count = 0;
		float totalMultas = 0;
		
		for (int i = 0; i < veiculos.length; i++) {
			Veiculo veiculo = new Veiculo();
			float velocidadeAtual = (float) ((Math.random()*122.2)+40);
			veiculo.setVelocidadeAtual(velocidadeAtual);
			System.out.println("Nome do Proprietário: ");
			veiculo.setNomeDoPropietario(input.nextLine());
			System.out.println("Número da Placa: ");
			veiculo.setPlaca(input.nextLine());
			veiculos[i] = veiculo;
		}
		for (Veiculo v : veiculos) {
            try {
                //System.out.print("você foi multado, e o valor e: ");
                System.out.println("nome: " + v.getNomeDoPropietario() + "\nplaca: " + v.getPlaca());
                radar.verificarVelocidade(v);
                System.out.println("Não foi Multado");
            } catch (VelocidadeMaximaNaoRespeitadaException | VelocidadeMinimaNaoRespeitadaException erro) {
                System.out.println(erro.getMessage());
                count+=1;
            }
		}
            //m.out.println("Quantidades de multas aplicadas: "+count+"\n Valor Total Multas: "+totalMultas);	
	} 
}
