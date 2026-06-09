package Gerenciador_Debate;

public class DebatePadrao implements EstadosDebate {

    @Override
    public void executar(Mediator mediator, Configuracao config) {
        mediator.debate_comum(config);
        if (mediator.getsolicitacaoconcedida().size() > 0) {
            mediator.setestado_debate(new DebateResposta());
            mediator.debate(config);
        }
    }

    
}
