package AtividadeHeranca.Atividade07;

public class Main {
    public static void main(String[] args) {
        Smartphone s = new Smartphone("Samsung", "Galaxy S22", "Android");
        Televisao tv = new Televisao("LG", "OLED55", 55);

        s.ligar();
        tv.ligar();
    }
}

