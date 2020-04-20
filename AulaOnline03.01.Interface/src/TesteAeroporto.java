
public class TesteAeroporto {
	
	public static void main(String[] args) {
		
		Pato pato = new Pato("Donaldo");
		Aeroporto.preparaParaVoar(pato);
		
		Voaable superMan = new SuperMan();
		Aeroporto.preparaParaVoar(superMan);
		
		Voaable aviao = new Aviao();
		Aeroporto.preparaParaVoar(aviao);
		
	}

}
