package Atividade2804;

public class Aluno extends Professor {

    private String matricula;

    public void estudar(){
        System.out.println("Estou estudando.");
    }

    // getter e setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
