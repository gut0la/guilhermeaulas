package AtividadeHeranca.Atividade06;

class Professor extends Pessoa {
    String departamento;

    Professor(String nome, int idade, String departamento) {
        super(nome, idade);
        this.departamento = departamento;
    }

    @Override
    void apresentar() {
        System.out.println("Professor: " + nome + ", " + idade + " anos, Departamento: " + departamento);
    }
}

