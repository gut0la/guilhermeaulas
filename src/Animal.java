public class Animal {

    private String nome;
    private int idade;

    public void comer() {
        System.out.println("Animal comendo...");
    }

    // getter e setter
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
