package ativ01;

public class Publicacao {

    private String Autor;
    private String Titulo;
    private Implementador imp;
    

    // construtor
    public Publicacao(String autor, String titulo) {

        Autor = autor;
        Titulo = titulo;
    }
    // define a istancia do implementador e passa a istancia do objeteto atual para o parametro tipo,
    // no metodo do implementador instanciado
    public void ObterDados(Implementador imp) {
        this.imp = imp;
        imp.getDados(this);

    }

    public void getTitulo(){System.out.println(Titulo);}

    public void getAutor() {System.out.println(Autor);}

}
