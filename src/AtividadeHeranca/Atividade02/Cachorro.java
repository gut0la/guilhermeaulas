package AtividadeHeranca.Atividade02;

class Cachorro extends Animal {
    String raca;

    Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    void emitirSom() {
        System.out.println("Latido!");
    }
}

