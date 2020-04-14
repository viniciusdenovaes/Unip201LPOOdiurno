
public class TesteVeterinario {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------------");
		System.out.println("Testando Gato");
		System.out.println("---------------------------");
		Animal gato = new Animal("Luquita", "Gato");
		gato.adoece();
		Veterinario.curar(gato);
		
		
		System.out.println("\n---------------------------");
		System.out.println("Testando Cachorro");
		System.out.println("---------------------------");
		Animal cachorro = new Animal("Brutus", "Cachorro");
		cachorro.adoece();
		Veterinario.curar(cachorro);
		
		System.out.println("\n---------------------------");
		System.out.println("Testando Raposa");
		System.out.println("---------------------------");
		Animal raposa = new Animal("Fox", "Raposa");
		raposa.adoece();
		Veterinario.curar(raposa);
		
		System.out.println("\n---------------------------");
		System.out.println("Testando outro Cachorro");
		System.out.println("---------------------------");
		Animal cachorroB = new Animal("Milo", "Cachor"); // Criado tipo errado
		cachorroB.adoece();
		Veterinario.curar(cachorroB);
		
		
	}

}
