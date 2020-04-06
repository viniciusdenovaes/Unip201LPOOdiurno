
public class TesteFrelancer {
	
	public static void main(String[] args) {
		
		Freelancer f = new Freelancer("Carla", 100);
		
		f.addHora(1.2);
		f.addHora(2.5);
		
		System.out.println(f);
		
		System.out.println("Pagamento: " + f.getPagamento());

		
	}

}
