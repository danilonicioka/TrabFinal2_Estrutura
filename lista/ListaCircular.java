package lista;

/*
Métodos:
 - adicionar no final
 - imprimir sequência
*/

public class ListaCircular {
    
    private Celula primeira;
    private Celula ultima;
    private int totalElementos;
    
    
    public void adiciona(Object info) {
        if (totalElementos == 0) {
            Celula nova = new Celula(info, this.primeira);
            this.primeira = this.ultima = nova;        
            this.totalElementos++;;
        }
        else {
            Celula nova = new Celula(info);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            nova.setProxima(primeira);
            this.totalElementos++;
        }
    }    
    
    public void sequencia() {
        Celula atual = this.primeira;
        
        if(this.totalElementos != 0) {
            
            System.out.println("Sequência dos alunos");
            
            for(int i=1; i<=this.totalElementos; i++) {
            System.out.print(i + ": ");
            System.out.print(atual.toString());
            atual = atual.getProxima();
            System.out.print(" ---> ");
            System.out.println(atual.toString());
            }
            
        }
        else
            System.out.println("Não há alunos no círculo");
    }
    
}