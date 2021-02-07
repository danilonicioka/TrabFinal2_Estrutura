package lista_06;

/*
Métodos:
 - adicionar
 - remover
 - inserir
 - imprimir
*/

public class ListaEncadeada {
    
    private Celula primeira;
    private Celula ultima;
    private int totalElementos;
    
    
    //Adiciona em qualquer posição
    public void adicionar(int posicao, Object info) throws Exception {
        if((posicao == 0) || posicao == this.totalElementos) {
            
            Celula nova = new Celula(info, this.primeira);
            this.primeira = nova;
        
            if(this.totalElementos == 0){
               this.ultima = this.primeira;
            }
            this.totalElementos++;;
        
        }
        else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(info, anterior.getProxima()); //Aloc dinâmica
            anterior.setProxima(nova);
            this.totalElementos++;
        }
    }
    
    //Remove de qualquer posição
    public void remover(int posicao) throws Exception {
        if((posicao == 0) || posicao == this.totalElementos) {
            if(this.totalElementos != 0) { //verifica se a primeira posição está ocupada
                this.primeira = primeira.getProxima();
                this.totalElementos--;
            }
        }
        else {
            Celula anterior = this.pegaCelula(posicao - 1);
            anterior.setProxima(this.pegaCelula(posicao + 1));
            this.totalElementos--;
        }
    }

    public void inserir(int posicao, Object info) {
        if(posicaoOcupada(posicao)) {
            Celula atual = this.primeira;
            int i = 0;
            while(i < posicao) {
                atual = atual.getProxima();
                i++;
            }
            atual.setInfo(info);
        }
    }
    
    public void imprimeLista() {
        Celula atual = this.primeira;
        
        while(atual != null) {
            System.out.println(atual.toString());
            atual = atual.getProxima();
        }
    }

    //Retorna o conteúdo do objeto célula da posição indicada
    public Object pegaInfo(int posicao) throws Exception {
        return this.pegaCelula(posicao).getInfo();
    }
    
    //Retorna o objeto célula da posição indicada
    private Celula pegaCelula(int posicao) throws Exception {
        if(posicao < 0 || posicao > this.totalElementos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        Celula atual = this.primeira;
        int i = 0;
        while(i < posicao) {
            atual = atual.getProxima();
            i++;
        }
        return atual;
    }
    
    
    private boolean posicaoOcupada(int posicao) {
        if (this.totalElementos == 0) {
            return false;
        }
        
        Celula atual = this.primeira;
        int i = 0;
        while(i < posicao) {
            atual = atual.getProxima();
            i++;
        }
        if((atual != null)) {
            return true;
        }
        return false;
    }   
    
}