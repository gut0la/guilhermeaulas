package AtividadeHeranca.Atividade06;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Carlos", 45, "Matemática");
        Aluno aluno = new Aluno("Ana", 20, "Engenharia");

        prof.apresentar();
        aluno.apresentar();
    }
}

