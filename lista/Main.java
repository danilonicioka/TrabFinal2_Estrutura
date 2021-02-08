package lista;

public class Main {

    public static void main(String[] args) {
        
        ListaCircular lc = new ListaCircular();
        
        Aluno a0 = new Aluno("Pedro");
        Aluno a1 = new Aluno("Tiago");
        Aluno a2 = new Aluno("João");
        Aluno a3 = new Aluno("Golfo");
        Aluno a4 = new Aluno("Meier");
        Aluno a5 = new Aluno("Oscar");
        
        
        lc.adiciona(a0);
        lc.adiciona(a1);
        lc.adiciona(a2);
        lc.adiciona(a3);
        lc.adiciona(a4);
        lc.adiciona(a5);
       
        
        lc.sequencia();
        
    }
    
}