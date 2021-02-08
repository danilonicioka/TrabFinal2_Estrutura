package problemas.TrabFinal2_Estrutura.Q_Fila;

class Atividade {

    private String aluno, nota, estado;
    
    public Atividade(String aluno, String nota, String estado){
        this.aluno = aluno; //nome do aluno
        this.nota = nota; //nota atribuída pelo professor
        this.estado = estado; //definirá se aluno foi aprovado ou reprovado de acordo com a média 7
    }
    
    public Atividade(String aluno){
        this.aluno = aluno;
        this.nota = "A definir";
        this.estado = "A definir";
    }

    @Override
    public String toString() {
        return "Atividade{" + "aluno=" + aluno + ", nota=" + nota + ", estado=" + estado + '}';
    }


    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
}
