package AtividadeInterface.Atividade03;

abstract class Funcionario implements Trabalhador {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public void descansar() {
        System.out.println(nome + " está descansando.");
    }
}