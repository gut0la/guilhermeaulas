package AtividadeInterface.Atividade04;


public class Main {
    public static void tocarEAfinar(InstrumentoMusical instrumento) {
        instrumento.tocar();
        instrumento.afinar();
    }

    public static void main(String[] args) {
        InstrumentoMusical violao = new Violao();
        InstrumentoMusical piano = new Piano();
        InstrumentoMusical flauta = new Flauta();

        tocarEAfinar(violao);
        tocarEAfinar(piano);
        tocarEAfinar(flauta);
    }
}
