package AtividadeHeranca.Atividade02;

class Gato extends Animal {
    String cor;

    Gato(String nome, String cor) {
        super(nome);
        this.cor = cor;
    }

    @Override
    void emitirSom() {
        System.out.println("Miau!");
    }
}

