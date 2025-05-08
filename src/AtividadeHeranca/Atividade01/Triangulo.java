package AtividadeHeranca.Atividade01;

class Triangulo extends Forma {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Triângulo com área: " + calcularArea();
    }
}

