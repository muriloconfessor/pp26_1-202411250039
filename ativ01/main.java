package ativ01;

public class main {
    
    public static void main(String[] args) {
        PublicacaoImplBD BD = new PublicacaoImplBD();

        Publicacao Livro = new Livro(BD);
        Livro.ObterDados();
        Livro.setTitulo("Teste");
        Livro.getTitulos();
       


        

        

    }
}
