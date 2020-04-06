
public class Freelancer extends Funcionario{
	
	private double hora;
	
	public Freelancer(String aNome, double aSalario) {
		super(aNome, aSalario);
		this.hora = 0;
	}
	
	public double getHora() {
		return this.hora;
	}
	
	public void addHora(double horas) {
		this.hora += horas;
	}
	
	@Override
	public double getPagamento() {
		return this.getHora()*this.getSalario();
	}

	
	@Override
	public String toString() {
		String res = super.toString();
		
		res += "Horas: " + this.hora;
		
		return res;
	}

}
