package AtividadeHeranca.Atividade02;

abstract class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    abstract void emitirSom();
}

