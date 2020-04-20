import java.io.Serializable;

public class Pato extends Animal implements Voaable {

	public Pato(String aNome) {
		super(aNome, "Pato");
	}

	@Override
	public void alimenta() {
		System.out.println("Joga comida pro pato");
	}

	@Override
	public void fazBarulho() {
		System.out.println("Qua Qua");
	}
	
	@Override
	public void voar() {
		System.out.println("Pato voa muito mal");
	}

}
