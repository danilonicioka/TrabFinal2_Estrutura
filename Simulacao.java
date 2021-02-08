package lista;

public class Simulacao {

    public static void main(String[] args) {
        
        /*
         Programa que simula uma brincadeira infantil de roda.
         Uma lista circular recebe elementos do tipo aluno,
         cujo único atributo são seus nomes.
         Dentro da lista, cada elemento guardará a posição do próximo.  
         Para mais detalhes, confira o relatório.
        */
        ListaCircular lc = new ListaCircular();
        
        //Alunos hipotéticos
        Aluno a0 = new Aluno("Pedro");
        Aluno a1 = new Aluno("Tiago");
        Aluno a2 = new Aluno("Lucas");
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
