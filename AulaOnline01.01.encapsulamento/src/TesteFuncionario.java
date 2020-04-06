
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Ana", 2123.12);
		
		System.out.println(f);
		
		f.setSalario(3123.01);
		System.out.println("novo salario " + f.getSalario());
		System.out.println("novo pagamento " + f.getPagamento());
		
		
	}

}
