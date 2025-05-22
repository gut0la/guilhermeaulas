package AtividadeInterface.Atividade02;

class Gato implements Animal {
    private String nome;

    public Gato(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está andando sorrateiramente!");
    }
}