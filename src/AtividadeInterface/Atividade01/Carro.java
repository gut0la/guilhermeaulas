package AtividadeInterface.Atividade01;

class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando com motor a combustão!");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando com freios ABS!");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Carro virando para " + direcao);
    }
}