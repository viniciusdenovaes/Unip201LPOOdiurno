
public class TesteCadastroAluno {
	
	public static void main(String[] args) {
		
		CadastroAluno cadastro = new CadastroAluno();
		
		cadastro.nome.primeiroNome = "Ana";
		cadastro.nome.sobrenome = "Cardoso";
		
		cadastro.endereco.rua = "Sem nome";
		cadastro.endereco.numero = 0;
		
		cadastro.display();
		
		CadastroAluno cadastro2 = new CadastroAluno();
		
		cadastro2.nome.primeiroNome = "Beto";
		cadastro2.nome.sobrenome = "Barbosa";
		
		cadastro2.endereco.rua = "Com nome";
		cadastro2.endereco.numero = 1;
		
		cadastro2.display();
		
		
		
	}

}
