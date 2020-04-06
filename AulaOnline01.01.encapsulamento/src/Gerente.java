
public class Gerente extends Funcionario{
	
	private double bonus;
	
	public Gerente(String aNome, double aSalario, double aBonus) {
		super(aNome, aSalario);
		this.bonus = aBonus;
	}
	
	public double getBonus() {
		return this.bonus;
	}
	
	public void setBonus(double aBonus) {
		this.bonus = aBonus;
	}
	
	
	@Override
	public double getPagamento() {
		return this.getSalario() + this.getBonus();
	}
	
	
	@Override
	public String toString() {
		String res = super.toString();
		
		res += "Bonus: " + this.bonus;
		
		return res;
	}

}
