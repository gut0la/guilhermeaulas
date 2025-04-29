package Atividade2804;

public class Professor extends Pessoa {

    private Double salario;

    public void ensinar(){
        System.out.println("Estudem para passarem de ano.");
    }

    // getter e setters
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
