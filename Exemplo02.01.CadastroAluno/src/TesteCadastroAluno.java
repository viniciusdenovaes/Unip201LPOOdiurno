
public class TesteCadastroAluno {
	
	public static void main(String[] args) {
		
		CadastroAluno cadastro = new CadastroAluno();
		
		cadastro.nome = new Nome();
		cadastro.nome.primeiroNome = "Ana";
		cadastro.nome.sobrenome = "Cardoso";
		
		cadastro.endereco = new Endereco();
		cadastro.endereco.rua = "Sem nome";
		cadastro.endereco.numero = 0;
		
		
	}

}
