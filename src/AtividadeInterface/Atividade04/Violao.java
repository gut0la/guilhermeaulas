package AtividadeInterface.Atividade04;



class Violao implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando o violão com acordes melodiosos!");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando as cordas do violão!");
    }
}
