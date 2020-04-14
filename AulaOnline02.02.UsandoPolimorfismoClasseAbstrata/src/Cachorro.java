public class Cachorro extends Animal{

	public Cachorro(String aNome) {
		super(aNome, "Cachorro");
	}

	@Override
	public void alimenta() {
		System.out.println("Colocando racao de cachorro para " + this.getNome());
	}

	@Override
	public void fazBarulho() {
		System.out.println("Au Au Au");
	}

}
