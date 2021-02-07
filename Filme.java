package lista_06;

public class Filme {

    private String nome;
    private String ano;
    private String diretor;
    private String genero;
    
    public Filme(String nome, String ano, String diretor, String genero) {
        this.setNome(nome);
        this.setAno(ano);
        this.setDiretor(diretor);
        this.setGenero(genero);
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Filme{" + "nome= " + nome + ", ano= " + ano + ", diretor= " + diretor + ", genero= " + genero + "}\n");
        return s.toString();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
