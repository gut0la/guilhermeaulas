package AtividadeHeranca.Atividade07;

abstract class Eletronico {
    String marca;
    String modelo;

    Eletronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    abstract void ligar();
}
