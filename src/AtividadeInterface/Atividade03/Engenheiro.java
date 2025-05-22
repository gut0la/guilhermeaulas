package AtividadeInterface.Atividade03;

class Engenheiro extends Funcionario {
    public Engenheiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está projetando sistemas complexos!");
    }
}
