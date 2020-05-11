import java.util.Scanner;

public class TesteSemException {
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("Entre com um numero positivo par");
			Scanner in = new Scanner(System.in);
			int numero = Integer.parseInt(in.next());
			int resposta = metadeParPositivo(numero);
			
			if(resposta==-1) {
				System.out.println("numero entrado nao foi positivo");
			}else if(resposta==-2) {
				System.out.println("numero entrado nao foi par");
			}else {
				System.out.println("resposta eh " + resposta);
			}
		}
		
		
	}
	
	// Precisa receber numero par positivo
	// Retorna -1 caso numero nao seja positivo
	// Retorna -2 caso o numero nao seja par
	public static int metadeParPositivo(int numero) {
		if(numero<0) {
			return -1;
		}
		if(numero%2==1) {
			return -2;
		}
		
		return numero/2;
	}

}
