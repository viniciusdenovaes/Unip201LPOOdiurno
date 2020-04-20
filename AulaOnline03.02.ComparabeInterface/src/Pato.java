
public class Pato implements Comparable<Pato>{
	
	private String nome;
	private int id;
	
	public Pato(String aNome, int aId) {
		super();
		this.nome = aNome;
		this.id = aId;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String aNome) {
		this.nome = aNome;
	}
	public int getId() {
		return id;
	}
	public void setId(int aId) {
		this.id = aId;
	}
	
	@Override
	public boolean equals(Object outro) {
		
		Pato outroPato = (Pato)outro;
		
		return this.getId() == outroPato.getId();
		
	}
	
	// retorna um inteiro positivo se this eh maior que outro
	// retorna um inteiro negativo se this eh menor que outro
	// retorna zero se this eh igual ao outro
	@Override
	public int compareTo(Pato outro) {
		
		return Integer.compare(this.getId(), outro.getId());
	}
	
	

	@Override
	public String toString() {
		return "Pato [nome=" + nome + ", id=" + id + "]";
	}

	
	

}
