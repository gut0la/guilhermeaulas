package AtividadeHeranca.Atividade07;

class Smartphone extends Eletronico {
    String sistemaOperacional;

    Smartphone(String marca, String modelo, String sistemaOperacional) {
        super(marca, modelo);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    void ligar() {
        System.out.println("Smartphone da marca " + marca + " ligado com sistema " + sistemaOperacional);
    }
}

