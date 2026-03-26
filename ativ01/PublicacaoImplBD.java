package ativ01;

public class PublicacaoImplBD implements Implementador {

    public PublicacaoImplBD() {}
    //o metodo recebe o tipo do objeto de publicacao e ler suas informações
    @Override
    public void getDados(Publicacao tipo) {
        System.out.println("Arquivo Banco de dados selecionado");
        tipo.getAutor();
        tipo.getTitulo();
    }
    
}
