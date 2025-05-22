package AtividadeInterface.Atividade05;



class ArquivoImagem implements Arquivo {
    private String nome;

    public ArquivoImagem(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo imagem: " + nome);
    }

    @Override
    public void fechar() {
        System.out.println("Fechando imagem: " + nome);
    }

    @Override
    public void ler() {
        System.out.println("Exibindo pixels da imagem: " + nome);
    }
}
