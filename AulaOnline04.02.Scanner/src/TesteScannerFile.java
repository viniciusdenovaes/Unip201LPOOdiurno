import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteScannerFile {
	
	public static void main(String[] args) {
		
		Scanner in;
		try {
			in = new Scanner(new File("files/entrada.in"));
			while( in.hasNext() ) {    // le ate o EOF (ctrl+D no linux)
				System.out.println("palavra: (" + in.next() + ")");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Programa terminou");
		
	}

}
