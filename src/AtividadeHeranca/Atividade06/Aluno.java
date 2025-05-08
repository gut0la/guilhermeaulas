package AtividadeHeranca.Atividade06;

class Aluno extends Pessoa {
    String curso;

    Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    void apresentar() {
        System.out.println("Aluno: " + nome + ", " + idade + " anos, Curso: " + curso);
    }
}

