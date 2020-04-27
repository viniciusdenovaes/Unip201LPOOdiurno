import java.util.Scanner;

public class TesteScanner {
	
	public static void main(String[] args) {
		
		Scanner in;
		in = new Scanner(System.in);
		while( in.hasNext() ) {    // le ate o EOF (ctrl+D no linux)
			System.out.println("palavra: (" + in.next() + ")");
		}
		
		System.out.println("Programa terminou");
		
	}

}
