package Gerenciador_Debate;

public class ConfiguracaoConcreta02 implements ConfiguracaoBuilder {
    private Configuracao configuracao;

    public ConfiguracaoConcreta02() {
        configuracao = new Configuracao();
    }

    @Override
    public void tempopergunta() {
        configuracao.setpergunta(2);
    }

    @Override
    public void temporesposta() {
        configuracao.setresposta(2);
    }


    @Override
    public void temporeplica() {
        configuracao.setreplica(1);
    }

    @Override
    public void tempotreplica() {
        configuracao.settreplica(1);
    }

    @Override
    public void tempodr() {
        configuracao.setdr(1);
    }

    @Override
    public Configuracao getconfiguracaco() {
        return configuracao;
    }
}