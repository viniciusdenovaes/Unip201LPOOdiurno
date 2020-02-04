class Teste{
    public static void main(String args[]){
        System.out.println("Ola Pessoal!!!");
        System.out.println("Vamos fazer um cachorro");
        
        Cachorro caozinho;
        caozinho = new Cachorro();
        
        caozinho.nome = "tobias";
        caozinho.idade = 18;
        caozinho.peso = 20.0;
        
        caozinho.latir();
        
        Cachorro cao = new Cachorro();
        
        cao.nome = "fada";
        cao.idade = 25;
        cao.peso = 40.0;
        
        cao.latir();
        
        caozinho = cao;
        
        caozinho.nome = "jorge";
        
        cao.latir();
        
        
        
    }
}
