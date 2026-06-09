package Gerenciador_Debate;

public class DebateResposta implements EstadosDebate {

    @Override
    public void executar(Mediator mediator, Configuracao config) {
        mediator.debate_resposta(config);
        mediator.setsituacaodr(false);
        mediator.setestado_debate(new DebatePadrao());
        Logger.getInstance().registrarlog("Debate finalizado apos DRs");

    }

}