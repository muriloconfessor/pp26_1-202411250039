package ativ01;

public class cliente {
    public static void main(String[] args) {
    
        Publicacao Livro = new Livro("Jose", "o principe");
        Livro.ObterDados(new PublicacaoImplBD());

        Publicacao Revista = new Revista("maria", "Jose");
        Revista.ObterDados(new PublicacaoImplXML());
    
    
       


        

        

    }
}
