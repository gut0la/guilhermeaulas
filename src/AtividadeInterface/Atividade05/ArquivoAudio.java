package AtividadeInterface.Atividade05;



class ArquivoAudio implements Arquivo {
    private String nome;

    public ArquivoAudio(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo de áudio: " + nome);
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo de áudio: " + nome);
    }

    @Override
    public void ler() {
        System.out.println("Reproduzindo áudio: " + nome);
    }
}
