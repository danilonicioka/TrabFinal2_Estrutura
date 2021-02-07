package problemas.TrabFinal2_Estrutura;


public class Pilha<T> extends EstruturaEstatica<T>{
 
    public Pilha(){
        super();
    }
    
    public Pilha(int capacidade){
        super(capacidade);
    }
    
    public void empilha(T elemento){
        this.adiciona(elemento); 
        //é um método que adiciona no final, único jeito para adicionar elementos numa pilha
    }
    
    public T topo(){ 
    //vai retornar o elemento no topo da pilha, q vai ser do tipo T
        if(this.vazia()){
            return null;
        }
        return this.elementos[tamanho-1];
    }
    
    public T desempilha(){
        if(this.vazia()){
            return null;
        }
        return this.elementos[--tamanho];
        //retorna o elemento retirado e tb decrementa o tamanho
    }
}
