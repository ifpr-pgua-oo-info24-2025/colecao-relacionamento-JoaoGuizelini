public class Livro {
private String titulo;
private Integer anoPublicacao;
private Autor autor;
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public Integer getAnoPublicacao() {
    return anoPublicacao;
}
public void setAnoPublicacao(Integer anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
}
public Autor getAutor() {
    return autor;
}
public void setAutor(Autor autor) {
    this.autor = autor;
}

public String exibirDetalhes() {
    return "titulo = " + titulo + ", ano Publicacao = " + anoPublicacao + ", nome autor=" + autor.getNome() + ", autor nacionalidade = " + autor.getNacionalidade();
}

}
