public class LivroDigital extends Livro {
    private double tamanhoDoArquivo;

    public double getTamanhoDoArquivo() {
        return tamanhoDoArquivo;
    }

    public void setTamanhoDoArquivo(double tamanhoDoArquivo) {
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", tamanho do arquivo = " + tamanhoDoArquivo;
    }
    
}
