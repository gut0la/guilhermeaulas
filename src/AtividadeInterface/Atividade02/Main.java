package AtividadeInterface.Atividade02;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Mimi");
        Animal passaro = new Passaro("Piu");

        cachorro.emitirSom();
        cachorro.mover();
        gato.emitirSom();
        gato.mover();
        passaro.emitirSom();
        passaro.mover();
    }
}