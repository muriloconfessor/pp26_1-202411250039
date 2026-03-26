package ativ01;

public class PublicacaoImplBD implements Implementador {

    public PublicacaoImplBD() {}

    @Override
    public void getDados(Publicacao tipo) {
        System.out.println("Arquivo Banco de dados selecionado");
    }
    
}
