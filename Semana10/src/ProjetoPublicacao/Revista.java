package ProjetoPublicacao;

public class Revista extends Publicacao{

	private int numero;
	public void mostrar() {
		System.out.println("Nome: "+getNome()+" Numero: "+getNumero());	
	}
	public void introduzDados() {
		System.out.println("Nome: ");
		setNome(sc.nextLine());
		System.out.println("Numero: ");
		setNumero(Integer.parseInt(sc.nextLine()));
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
