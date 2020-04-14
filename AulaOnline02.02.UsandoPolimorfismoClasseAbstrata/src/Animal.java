
abstract public class Animal {
	
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
	
	abstract public void alimenta();
	
	abstract public void fazBarulho();
	
	public void dorme() {
		System.out.println("ZZzzzZZZzzzZZZ");
	}
	

}





