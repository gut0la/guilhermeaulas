package AtividadeHeranca.Atividade07;

class Televisao extends Eletronico {
    int tamanhoTela;

    Televisao(String marca, String modelo, int tamanhoTela) {
        super(marca, modelo);
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    void ligar() {
        System.out.println("TV de " + tamanhoTela + " polegadas da marca " + marca + " ligada");
    }
}

