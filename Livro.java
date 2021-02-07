package problemas.TrabFinal2_Estrutura;

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
        return "Livro{" + "nome=" + getNome() + ", autor=" + getAutor() + ", isbn=" + getIsbn() + ", ano=" + getAno() + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
