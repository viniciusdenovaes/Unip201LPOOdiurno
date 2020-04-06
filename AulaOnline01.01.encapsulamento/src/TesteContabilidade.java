
public class TesteContabilidade {
	
	public static void main(String[] args) {
		
		Funcionario f01 = new Funcionario("Ana", 2_100.10);
		
		Contabilidade.pagarFuncionario(f01);
		
		Gerente f02 = new Gerente("Bia", 2_200.00, 400);
		
		Contabilidade.pagarFuncionario(f02);
		
		Freelancer f03 = new Freelancer("Carla", 100.00);
		f03.addHora(5.6);
		f03.addHora(0.4);
		
		Contabilidade.pagarFuncionario(f03);
		
	}

}
