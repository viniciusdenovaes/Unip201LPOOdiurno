
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente("Bia", 2_000.00, 400.00);
		
		System.out.println(g);
		
		System.out.println("Pagamento: " + g.getPagamento());
		
	}

}
