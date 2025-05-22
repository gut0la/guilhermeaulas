package AtividadeInterface.Atividade04;


class Piano implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando o piano com teclas suaves!");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o piano com precisão!");
    }
}


