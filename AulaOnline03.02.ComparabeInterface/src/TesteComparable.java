
public class TesteComparable {
	
	public static void main(String[] args) {
		
		Pato p1 = new Pato("Do", 10);
		Pato p2 = new Pato("Do", 10);
		Pato p3 = new Pato("Ma", 20);
		Pato p4 = new Pato("Ma", 10);
		Pato p5 = new Pato("Ma", 2);
		
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		
		System.out.println(p1.compareTo(p2));
		System.out.println(p1.compareTo(p3));
		System.out.println(p1.compareTo(p4));
		System.out.println(p1.compareTo(p5));
		
	}

}
