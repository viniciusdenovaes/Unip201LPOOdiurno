
public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario(String aNome, double aSalario) {
		this.nome = aNome;
		this.salario = aSalario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String aNome) {
		this.nome = aNome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double aSalario) {
		this.salario = aSalario;
	}
	
	
	public double getPagamento() {
		return this.getSalario();
	}
	
	
	@Override
	public String toString() {
		String res = "";
		
		res += "Nome: " + this.nome + "\n";
		res += "Salario: " + this.salario + "\n";
		
		return res;
	}
	
	

}
