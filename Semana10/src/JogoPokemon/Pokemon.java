package JogoPokemon;

public class Pokemon {
	
	// array de ataques, pois não poder ser maior que 4
	
	private String nome;
	private String tipo;
	private int nivel;
	public Ataque[] ataques;
	
	public Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ataques = new Ataque[4];

        for (int i = 0; i < 4; i++) {
            this.ataques[i] = new AtaqueNulo();
        }
    }

    public void setAtaque(int indice, Ataque ataque) {
        if (indice >= 0 && indice < 4) {
            ataques[indice] = ataque;
        } else {
            System.out.println("Índice inválido.");
        }
    }
    
    public void ataqueA() {
        ataques[0].executar();
    }

    public void ataqueB() {
        ataques[1].executar();
    }

    public void ataqueC() {
        ataques[2].executar();
    }

    public void ataqueD() {
        ataques[3].executar();
    }
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public String getNome() {
		return nome;
	}
	public void setTipo(String novoTipo) {
		tipo = novoTipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setNivel(int novoNivel) {
		nivel = novoNivel;
	}
	public int getNivel() {
		return nivel;
	}
	
	

}
