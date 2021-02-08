package lista;

public class ListaCircular {
    
    /*
    Métodos necessários:
     - adicionar no final
     - imprimir sequência
    */    
    private Celula primeira;
    private Celula ultima;
    private int totalElementos;
    
    
    public void adiciona(Object info) {
        //Caso a lista esteja vazia, add no começo
        if (totalElementos == 0) {
            Celula nova = new Celula(info, this.primeira);
            this.primeira = this.ultima = nova;        
            this.totalElementos++;;
        }
        //Caso contrário, add no final
        else {
            Celula nova = new Celula(info);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            nova.setProxima(primeira);
            this.totalElementos++;
        }
    }
    
    /*
     Note que, para a simulação desejada (descrita no relatório), não é necessária
    a operação de inserir em qualquer posição. Basta inserir no final.
    */
    
    public void sequencia() {
        Celula atual = this.primeira;
        
        if(this.totalElementos != 0) {
            
            System.out.println("\nSequência dos alunos");
            
            //A seta indica qual elementos aponta pra qual
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
