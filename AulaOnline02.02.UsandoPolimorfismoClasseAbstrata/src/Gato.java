
public class Gato extends Animal{
	
	public Gato(String aNome) {
		super(aNome, "Gato");
	}
	
	@Override
	public void alimenta() {
		System.out.println("Colocando racao de gato para " + this.getNome());
	}
	
	@Override
	public void fazBarulho() {
		System.out.println("Miaaaauuuu");
	}
	
	

}
