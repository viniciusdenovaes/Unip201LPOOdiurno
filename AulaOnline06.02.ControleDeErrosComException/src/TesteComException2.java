import java.util.Scanner;

public class TesteComException2 {
	
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
			
			}catch(NumeroNegativoException e){
				
				System.out.println("Estamos dentro do catch.");
				System.out.println("Ocorreu um erro.");
				System.out.println("Numero entrado nao eh positivo");
				
			}
			catch(NumeroImparException e) {
				System.out.println("Numero entrado nao eh par");
				System.out.println(e.getMessage());
			}
		}
		
		
	}
	
	// Precisa receber numero par positivo
	public static int metadeParPositivo(int numero) 
			throws NumeroNegativoException, NumeroImparException {
		if(numero<0) {
			throw new NumeroNegativoException("O numero entrado foi " + numero);
		}
		if(numero%2==1) {
			throw new NumeroImparException("O numero " + numero + " nao eh par");
		}
		
		return numero/2;
	}

}
