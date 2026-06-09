package Gerenciador_Debate;

public class ConfiguracaoConcreta implements ConfiguracaoBuilder {
    private Configuracao configuracao;

    public ConfiguracaoConcreta() {
        configuracao = new Configuracao();
    }

    @Override
    public void tempopergunta() {
        configuracao.setpergunta(4);
    }

    @Override
    public void temporesposta() {
        configuracao.setresposta(4);
    }


    @Override
    public void temporeplica() {
        configuracao.setreplica(2);
    }

    @Override
    public void tempotreplica() {
        configuracao.settreplica(2);
    }

    @Override
    public void tempodr() {
        configuracao.setdr(2);
    }

    @Override
    public Configuracao getconfiguracaco() {
        return configuracao;
    }
}