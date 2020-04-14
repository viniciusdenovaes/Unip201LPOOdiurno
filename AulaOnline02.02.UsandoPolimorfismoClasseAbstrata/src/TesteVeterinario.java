
public class TesteVeterinario {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------------");
		System.out.println("Testando Gato");
		System.out.println("---------------------------");
		Animal gato = new Gato("Luquita");
		gato.adoece();
		Veterinario.curar(gato);
		
		
		System.out.println("\n---------------------------");
		System.out.println("Testando Cachorro");
		System.out.println("---------------------------");
		Animal cachorro = new Cachorro("Brutus");
		cachorro.adoece();
		Veterinario.curar(cachorro);
		
		System.out.println("\n---------------------------");
		System.out.println("Testando Raposa");
		System.out.println("---------------------------");
		Animal raposa = new Raposa("Fox");
		raposa.adoece();
		Veterinario.curar(raposa);
		
		System.out.println("\n---------------------------");
		System.out.println("Testando outro Cachorro");
		System.out.println("---------------------------");
		Animal cachorroB = new Cachorro("Milo");
		cachorroB.adoece();
		Veterinario.curar(cachorroB);
		
//		System.out.println("\n---------------------------");
//		System.out.println("Testando outro Tartaruga");
//		System.out.println("---------------------------");
//		Animal tartaruga = new Tartaruga("Milo");
//		tartaruga.adoece();
//		Veterinario.curar(tartaruga);
		
		
	}

}
