package lista_06;

public class Questao_01 {

    public static void main(String[] args) throws Exception {
        
        Filme f1 = new Filme("Hulk", "2014", "Deniro", "Ação");
        Filme f2 = new Filme("Hulk", "2015", "Deniro", "Ação");
        Filme f3 = new Filme("Hulk", "2016", "Deniro", "Ação");
        
        ListaEncadeada lista = new ListaEncadeada();
        
        
        lista.adicionar(0, f3);
        lista.adicionar(1, f2);
        lista.imprimeLista();
        
        
    }
    
}
