package ProjetoPublicacao;

public class Quadrinhos extends Livro {
	private String desenhista; 
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Desenhista "+getDesenhista());		
	}

	public void introduzDados() {
		super.introduzDados();
		System.out.println("Desenhista: ");
		setDesenhista(sc.nextLine());
		
	}

	public String getDesenhista() {
		return desenhista;
	}

	public void setDesenhista(String desenhista) {
		this.desenhista = desenhista;
	}
	

}
