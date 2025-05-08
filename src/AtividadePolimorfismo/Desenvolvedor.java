package AtividadePolimorfismo;

public class Desenvolvedor extends Funcionario {
    private double desconto;

    public Desenvolvedor(String nome, double salarioBase, double desconto) {
        super(nome, salarioBase);
        this.desconto = desconto;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase - desconto;
    }
}

