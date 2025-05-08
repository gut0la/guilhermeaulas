package AtividadeHeranca.Atividade01;

class Circulo extends Forma {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return raio * 3.14 * 2;
    }

    @Override
    public String toString() {
        return "Círculo com área: " + calcularArea();
    }
}

