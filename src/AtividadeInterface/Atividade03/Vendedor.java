package AtividadeInterface.Atividade03;

class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está negociando com clientes!");
    }
}