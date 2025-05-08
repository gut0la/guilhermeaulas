package AtividadePolimorfismo;

public class Main {
    public static void main(String[] args) {
        // Usando polimorfismo: tipo Funcionario, instâncias variadas
        Funcionario f1 = new Gerente("Carlos", 5000.0, 1500.0);
        Funcionario f2 = new Desenvolvedor("Ana", 4000.0, 500.0);
        Funcionario f3 = new Analista("Bruno", 3000.0);

        // Exibir salários
        f1.exibirSalario(); // Deve mostrar: 5000 + 1500 = 6500
        f2.exibirSalario(); // Deve mostrar: 4000 - 500 = 3500
        f3.exibirSalario(); // Deve mostrar: 3000
    }
}

