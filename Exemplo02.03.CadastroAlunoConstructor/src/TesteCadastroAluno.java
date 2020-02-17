
public class TesteCadastroAluno {
	
	public static void main(String[] args) {
		
		CadastroAluno cadastro = 
				new CadastroAluno(
						"Ana", "Cardoso", 
						"Sem nome", 0);
		
		cadastro.display();
		
		CadastroAluno cadastro2 = 
				new CadastroAluno(
						"Beto", "Barbosa", 
						"Com nome", 1);
		
		cadastro2.display();
		
		
		
	}

}
