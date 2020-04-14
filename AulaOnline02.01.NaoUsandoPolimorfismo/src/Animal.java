
public class Animal {
	
	private String nome;
	private String tipo;
	private boolean isDoente;
	
	public Animal(String aNome, String aTipo) {
		this.nome = aNome;
		this.tipo = aTipo;
		this.isDoente = false;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String aNome) {
		this.nome = aNome;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void adoece() {
		this.isDoente = true;
	}
	
	public void cura() {
		this.isDoente = false;
	}
	
	public boolean verificaDoente() {
		return this.isDoente;
	}
	
	public void alimenta() {
		if(this.tipo == "Cachorro") {
			System.out.println("Colocando racao de cachorro para " + this.getNome());
		}
		else if(this.tipo == "Gato") {
			System.out.println("Colocando racao de gato para " + this.getNome());
		}
		else if(this.tipo == "Raposa") {
			System.out.println("Coloca comida de raposa para " + this.getNome());
		}
		else {
			System.out.println("Tipo nao reconhecido");
		}
	}
	
	public void fazBarulho() {
		if(this.tipo == "Cachorro") {
			System.out.println("Au Au Au");
		}
		else if(this.tipo == "Gato") {
			System.out.println("Miaaaauuuu");
		}
		else if(this.tipo == "Rapos") { // Escrevi Raposa errado!!!
			System.out.println("Que barulho que a raposa faz?");
		}
		else {
			System.out.println("Tipo nao reconhecido");
		}
	}
	
	public void dorme() {
		System.out.println("ZZzzzZZZzzzZZZ");
	}
	

}





