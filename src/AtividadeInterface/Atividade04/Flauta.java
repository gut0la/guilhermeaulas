package AtividadeInterface.Atividade04;


class Flauta implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando a flauta com notas agudas!");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando a embocadura da flauta!");
    }
}
