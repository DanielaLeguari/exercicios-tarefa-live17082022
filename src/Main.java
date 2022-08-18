public class Main {

    public static void main(String[] args) {
        //instanciando alunos
        Aluno aluno = new Aluno("João", "A123");
        Aluno aluno2 = new Aluno("Lucas", "B123");
        aluno2.setEndereco("Cascavel-PR");
        Aluno aluno3 = new Aluno("Carla", "C123");

        Professor professor = new Professor("Daniela", "Java");

        Turma turma = new Turma();
        turma.setProfessor(professor);
        turma.adicionarAluno(aluno);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
        System.out.println(turma.toString());

    }
}
