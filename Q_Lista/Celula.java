package problemas.TrabFinal2_Estrutura.Q_Lista;

public class Celula {
    
    /*
     Classe que controla a operação de uma lista encadeada
    */
    private Celula proxima;
    private Object info;
    
    public Celula(Object info, Celula proxima) {
        this.setInfo(info);
        this.setProxima(proxima);
    }
    
    public Celula(Object info) {
        this.setInfo(info);
    }
    
    @Override
    public String toString() {
        return info.toString();
    }
    

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
    
}
