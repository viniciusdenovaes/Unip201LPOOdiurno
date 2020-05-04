package teste;

import java.util.List;

import entity.Aluno;
import io_utils.InputText;
import io_utils.OutputText;

public class Teste {
	
	public static void main(String[] args) {
		List<Aluno> alunos = InputText.loadAlunos();
		
		System.out.println("\n\nNo Teste: \n\n");
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		
		alunos.add(new Aluno("Novo Aluno", 10, 5.5));
		
		OutputText.saveAluno(alunos);
	}

}
