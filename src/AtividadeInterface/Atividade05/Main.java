package AtividadeInterface.Atividade05;

public class Main {
    public static void main(String[] args) {
        java.util.List<Arquivo> arquivos = java.util.Arrays.asList(
                new ArquivoTexto("documento.txt"),
                new ArquivoImagem("foto.jpg"),
                new ArquivoAudio("musica.mp3")
        );

        for (Arquivo arquivo : arquivos) {
            arquivo.abrir();
            arquivo.ler();
            arquivo.fechar();
            System.out.println("---");
        }
    }
}
