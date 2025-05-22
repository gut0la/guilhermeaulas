package AtividadeInterface.Atividade01;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        carro.acelerar();
        carro.virar("esquerda");
        carro.frear();

        bicicleta.acelerar();
        bicicleta.virar("direita");
        bicicleta.frear();
    }
}