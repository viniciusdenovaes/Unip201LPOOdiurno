
public class CadastroAluno {
	
	Nome nome;
	Endereco endereco;
	
	public CadastroAluno(Nome nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	void display() {
		System.out.println("Cadastro do Aluno");
		this.nome.display();
		this.endereco.display();
	}

}
