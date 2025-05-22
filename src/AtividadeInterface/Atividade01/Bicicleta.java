package AtividadeInterface.Atividade01;

class Bicicleta implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Bicicleta acelerando com pedaladas!");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freando com freios manuais!");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Bicicleta virando para " + direcao + " com o guidão");
    }
}