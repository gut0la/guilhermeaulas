package AtividadeInterface.Atividade02;

class Cachorro implements Animal {
    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está correndo com quatro patas!");
    }
}
