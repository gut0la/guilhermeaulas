package Atividade2804;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setIdade(20);
        aluno.setMatricula("123456");
        aluno.apresentar();
        aluno.estudar();

        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setIdade(35);
        professor.setSalario(5000.0);
        professor.apresentar();
        professor.ensinar();
    }
}
