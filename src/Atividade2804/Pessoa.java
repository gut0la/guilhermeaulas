package Atividade2804;

public class Pessoa {

    private String nome;

    private int idade;

    public void apresentar(){
        System.out.println("Olá meu nome é " + this.nome + " e tenho " + this.idade + " anos.");
    }

    // getter e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
