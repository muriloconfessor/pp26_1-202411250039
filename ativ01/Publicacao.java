package ativ01;

public class Publicacao {

    private String Autor;
    private String Titulo;
    private Implementador imp;
    
    public Publicacao(Implementador imp) {this.imp = imp;}

    public void ObterDados() {imp.getDados(this);}

    public void getTitulos(){
        System.out.println(Titulo);
    }

    public void getAutor() {System.out.println(Autor);}

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
