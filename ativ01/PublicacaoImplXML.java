package ativ01;

public class PublicacaoImplXML implements Implementador {

    public PublicacaoImplXML() {}
      //o metodo recebe o tipo do objeto de publicacao e ler suas informações
    @Override
    public void getDados(Publicacao tipo) {
        System.out.println("Arquivo XML selecionado");
        tipo.getAutor();
        tipo.getTitulo();
    }
    
}
