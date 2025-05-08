package AtividadeHeranca.Atividade02;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex", "Labrador");
        dog.emitirSom();

        Gato cat = new Gato("Mimi", "Preto");
        cat.emitirSom();
    }
}

