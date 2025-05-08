package AtividadeHeranca.Atividade01;

class Retangulo extends Forma {
    double lado1;
    double lado2;

    Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Retângulo com área: " + calcularArea();
    }
}

