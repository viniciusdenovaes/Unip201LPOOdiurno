
public class Veterinario {
	
	public static void curar(Animal animal) {
		
		if(!animal.verificaDoente()) {
			System.out.println("Animal " + animal.getNome() + " pode ir para casa");
			return;
		}
		
		animal.alimenta();
		System.out.println("Aplicando injecao em " + animal.getNome());
		animal.cura();
		animal.fazBarulho();
		animal.dorme();
		
		System.out.println("Animal " + animal.getNome() + " pode ir para casa");
		
		
	}

}
