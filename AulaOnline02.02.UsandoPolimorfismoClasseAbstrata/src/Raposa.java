public class Raposa extends Animal{

	public Raposa(String aNome) {
		super(aNome, "Raposa");
	}

	@Override
	public void alimenta() {
		System.out.println("Coloca comida de raposa para " + this.getNome());
	}

	@Override
	public void fazBarulho() {
		System.out.println("Que barulho que a raposa faz?");
	}
	
}
