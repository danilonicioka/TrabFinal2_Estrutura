package problemas.TrabFinal2_Estrutura.Q_Lista;

public class Aluno {
    private String nome;
    
    public Aluno (String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(this.nome);
        return s.toString();
    }
}
