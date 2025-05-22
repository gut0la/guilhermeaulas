package AtividadeInterface.Atividade02;

class Passaro implements Animal {
    private String nome;

    public Passaro(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Piu piu!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está voando!");
    }
}