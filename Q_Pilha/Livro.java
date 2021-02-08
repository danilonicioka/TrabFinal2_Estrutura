package problemas.TrabFinal2_Estrutura.Q_Pilha;

class Livro {

    private String nome, autor;
    private int isbn, ano;
    
    public Livro(String nome, String autor, int isbn, int ano){
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", autor=" + autor + ", isbn=" + isbn + ", ano=" + ano + '}';
    }
    
    
}
