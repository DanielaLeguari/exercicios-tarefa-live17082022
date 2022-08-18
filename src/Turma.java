import java.util.ArrayList;

public class Turma {
    private Professor professor; // tipo objeto Professor
    private ArrayList<Aluno> listaAlunos;

    public Turma() {
        listaAlunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno); //recebendo aluno como parametro e adicionando na lista
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override  //mostrar todos os alunos e professor
    public String toString() {
        String nomes = "";
        for (Aluno aluno: listaAlunos) {
            nomes += "\t"+aluno.getNome()+ " "+(aluno.getEndereco() == null ? "Sem endereço" : aluno.getEndereco())+"\n";
        }
        return "Turma:\n" + "Professor: " + getProfessor().getNome()
                + "\nDisciplina:" + getProfessor().getDisciplina() +
                "\nAlunos:\n " +nomes;
    }
}
