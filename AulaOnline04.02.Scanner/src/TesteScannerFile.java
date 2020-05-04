import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TesteScannerFile {
	
	public static void main(String[] args) {
		
		Scanner in;
		try {
			//in = new Scanner(System.in, StandardCharsets.UTF_8);
			in = new Scanner(new File("files/entrada.in"), StandardCharsets.UTF_8);
			while( in.hasNext() ) {    // le ate o EOF (ctrl+D no linux)
				System.out.println("palavra: (" + in.next() + ")");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Programa terminou");
		
	}

}
