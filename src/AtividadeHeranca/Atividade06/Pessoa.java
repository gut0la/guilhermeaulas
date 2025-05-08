package AtividadeHeranca.Atividade06;

abstract class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    abstract void apresentar();
}

