import java.util.Scanner;

public class TesteComException {
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("\nEntre com um numero positivo par");
			Scanner in = new Scanner(System.in);
			int numero;
			try {
				numero = Integer.parseInt(in.next());
			}catch(NumberFormatException e) {
				System.out.println("Numero nao reconhecido como um inteiro");
				continue;
			}
			
			try {
				
				int resposta = metadeParPositivo(numero);
				System.out.println("resposta eh " + resposta);
			
			}catch(IllegalArgumentException e){
				
				System.out.println(e.getMessage());
				System.out.println("Tente novamente");
				
			}
		}
		
		
	}
	
	// Precisa receber numero par positivo
	public static int metadeParPositivo(int numero) 
			throws IllegalArgumentException {
		if(numero<0) {
			throw new IllegalArgumentException("O numero " + numero + " nao eh positivo");
		}
		if(numero%2==1) {
			throw new IllegalArgumentException("O numero " + numero + " nao eh par");
		}
		
		return numero/2;
	}

}
