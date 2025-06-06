public class livroFisico extends Livro {
    private Integer numeroDePaginas;

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", numero de Paginas = " + numeroDePaginas;
    }
    
}