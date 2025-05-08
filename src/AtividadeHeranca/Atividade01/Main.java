package AtividadeHeranca.Atividade01;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        System.out.println(c);

        Triangulo t = new Triangulo(4, 3);
        System.out.println(t);

        Retangulo r = new Retangulo(4, 4); // Quadrado
        System.out.println(r);
    }
}

