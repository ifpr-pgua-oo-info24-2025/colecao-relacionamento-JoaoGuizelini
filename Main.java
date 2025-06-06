import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        livroFisico LivroFisico =new livroFisico();
        livroFisico LivroFisico2 =new livroFisico();
        LivroDigital livroDigital1 = new LivroDigital();
        LivroDigital livroDigital2 = new LivroDigital();
        Autor autor1  = new Autor();
        Autor autor2 = new Autor();
        Autor autor3  = new Autor();
        Autor autor4  = new Autor();
        autor1.setNacionalidade("allSigma");
        autor1.setNome("colapso intergalatico");

        LivroFisico.setTitulo("a arte de ser Sigma 🥶🥶🥶🥶");
        LivroFisico.setAnoPublicacao(2025);
        LivroFisico.setNumeroDePaginas(137);
        LivroFisico.setAutor(autor1);

        autor2.setNacionalidade("allBeta");
        autor2.setNome(" Abusadilson ");

        LivroFisico2.setTitulo(" o lado bom de ser BETA (^///^)");
        LivroFisico2.setAnoPublicacao(2025);
        LivroFisico2.setNumeroDePaginas(69);
        LivroFisico2.setAutor(autor2);

        autor3.setNacionalidade("allOmega");
        autor3.setNome(" comedilson ");

        livroDigital1.setTitulo("o começo depois do fim");
        livroDigital1.setAnoPublicacao(2008);
        livroDigital1.setTamanhoDoArquivo(1.5);
        livroDigital1.setAutor(autor3);

        autor4.setNacionalidade("allAlfa");
        autor4.setNome(" Roberto o Alfa ");

        livroDigital2.setTitulo("roberto o alfa");
        livroDigital2.setAnoPublicacao(1997);
        livroDigital2.setTamanhoDoArquivo(2.3);
        livroDigital2.setAutor(autor4);

        ArrayList<Livro> biblioteca = new ArrayList<>();
        biblioteca.add(LivroFisico);
        biblioteca.add(LivroFisico2);
        biblioteca.add(livroDigital1);
        biblioteca.add(livroDigital2);

        for (Livro livro : biblioteca) {
            System.out.println(livro.exibirDetalhes()+"\n"); 
        }
    }
}