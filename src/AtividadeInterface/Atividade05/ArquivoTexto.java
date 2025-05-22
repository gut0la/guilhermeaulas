package AtividadeInterface.Atividade05;



class ArquivoTexto implements Arquivo {
    private String nome;

    public ArquivoTexto(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo de texto: " + nome);
    }

    @Override
    public void fechar() {
        System.out.println("Fechando arquivo de texto: " + nome);
    }

    @Override
    public void ler() {
        System.out.println("Lendo conteúdo do arquivo de texto: " + nome);
    }
}
