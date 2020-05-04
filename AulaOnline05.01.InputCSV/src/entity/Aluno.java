package entity;

public class Aluno {
	
	private String nome;
	private int ra;
	private double nota;
	
	public Aluno(String nome, int ra, double nota) {
		this.nome = nome;
		this.ra = ra;
		this.nota = nota;
	}
	
	

	public String getNome() {
		return nome;
	}



	public int getRa() {
		return ra;
	}



	public double getNota() {
		return nota;
	}



	@Override
	public String toString() {
		return "Aluno " + nome + " (" + ra + "), n= " + nota + "";
	}
	
	

}
