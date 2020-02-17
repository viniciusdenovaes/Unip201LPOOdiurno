
public class TesteCadastroAluno {
	
	public static void main(String[] args) {
		
		Nome nome = new Nome("Ana", "Cardoso");
		Endereco endereco = new Endereco("Sem nome", 0);
		CadastroAluno cadastro = 
				new CadastroAluno(nome, endereco);
		
		cadastro.display();
		
		
		CadastroAluno cadastro2 = 
				new CadastroAluno(
						new Nome("Beto", "Barbosa"), 
						new Endereco("Com nome", 1));
		
		cadastro2.display();
		
		
		
	}

}
