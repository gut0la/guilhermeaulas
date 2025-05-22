package AtividadeInterface.Atividade03;

public class Main {
    public static void main(String[] args) {
        Funcionario engenheiro = new Engenheiro("Ana", 5000.0);
        Funcionario vendedor = new Vendedor("João", 3000.0);

        engenheiro.trabalhar();
        engenheiro.descansar();
        vendedor.trabalhar();
        vendedor.descansar();
    }
}
