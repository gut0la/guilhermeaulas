package AtividadePolimorfismo;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal() {
        return salarioBase;
    }

    public void exibirSalario() {
        System.out.println("Funcionário: " + nome + ", Salário Total: R$ " + calcularSalarioTotal());
    }
}

