public class Aluno {
    private String nome;
    private String matricula;
    private String endereco;

    //construtor
    public Aluno(String nome, String matricula) {  // nome e matrícula sendo obrigatórios
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String turma) {
        this.endereco = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
