package lista;

public class Celula {

    private Celula anterior;
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
    
    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
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
