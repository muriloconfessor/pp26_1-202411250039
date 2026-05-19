package Gerenciador_Debate;
public class MediatorDebate extends Mediator{
    private InquiridorColaborador Inquiridor;
    private InquiridoColaborador Inquirido;
    private MicrofoneCronometro microfoneinquiridor;
    private MicrofoneCronometro microfoneinquirido;

    public MediatorDebate() {
        microfoneinquirido = new MicrofoneCronometro();
        microfoneinquiridor = new MicrofoneCronometro();
    }
    
    
    public void setInquiridor(PoliticoColaborador politico) {
        Inquiridor = new InquiridorColaborador(politico);
        Inquiridor.setmicrofone(microfoneinquiridor);
    }

    public void setInquirido(PoliticoColaborador politico) {
        Inquirido = new InquiridoColaborador(politico);
        Inquirido.setmicrofone(microfoneinquirido);
    }

    @Override
    public InquiridorColaborador getInquiridor() {return Inquiridor;}

    
    public void debate(Configuracao configuracao) {
        Inquiridor.falar(configuracao.getpergunta());
        System.out.println("");
        Logger.getInstance().registrarlog("pergunta de " + Inquiridor.getnome());
        Inquirido.falar(configuracao.getresposta());
        System.out.println("");
        Logger.getInstance().registrarlog("Resposta de " + Inquirido.getnome());
        Inquiridor.falar(configuracao.getreplica());
        System.out.println("");
        Logger.getInstance().registrarlog("Replica de " + Inquiridor.getnome());
        Inquirido.falar(configuracao.gettreplica());
        Logger.getInstance().registrarlog("Treplica de " + Inquirido.getnome());

    }

}
