package Gerenciador_Debate;
import java.util.Scanner;
import java.util.ArrayList;

public class MediatorDebate extends Mediator{
    private PoliticoColaborador Inquiridor;
    private PoliticoColaborador Inquirido;
    private EstadosDebate estado_debate;
    private Boolean situacaoDR;
    protected ArrayList <PoliticoColaborador> solicitacaodr;
    protected ArrayList <PoliticoColaborador> solicitacaoconcedida;

    public MediatorDebate() {
        solicitacaodr = new ArrayList<>();
        solicitacaoconcedida = new ArrayList<>();
        estado_debate = new DebatePadrao();
        situacaoDR = false;
    }
    
    public void adicionarsolicitacaodr(PoliticoColaborador politico) {
        solicitacaodr.add(politico);
    }


    public void analisarsolicitacaodr() {
        for (PoliticoColaborador politico : solicitacaodr) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("o politico " + politico.getnome() + " Solicitou DR, deseja conceder? s/n");
            String resposta = scanner.nextLine();
            if (resposta.equals("s")) {
                solicitacaoconcedida.add(politico);
                Logger.getInstance().registrarlog("DR concedida para " + politico.getnome());
            } else { 
                Logger.getInstance().registrarlog("Dr recusado para" + politico.getnome());
            }
        }

        solicitacaodr.clear();
    }

    public void setInquiridor(PoliticoColaborador politico) {
        Inquiridor = politico.clone();
    }

    public void setInquirido(PoliticoColaborador politico) {
        Inquirido = politico.clone();
    }

    @Override
    public PoliticoColaborador getInquiridor() {return Inquiridor;}

    @Override
    public PoliticoColaborador getInquirido() {return Inquirido;}

    
    public void debate_comum(Configuracao configuracao) {
        Logger.getInstance().registrarlog("o debate foi iniciado...");
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

        this.analisarsolicitacaodr();

    }

    public void setestado_debate(EstadosDebate estado) {
        this.estado_debate = estado;
    }

    public void debate_resposta(Configuracao config) {
        this.setsituacaodr(true);
        for (PoliticoColaborador politico : solicitacaoconcedida) {
            System.out.println("O politico " + politico.getnome() + " teve seu direito de resposta concedido");
            politico.falar(config.getdr());
        }

        solicitacaoconcedida.clear();
    }

    public ArrayList<PoliticoColaborador> getsolicitacaoconcedida() {
        return new ArrayList<>(this.solicitacaoconcedida);
    }

    public void debate(Configuracao config) {
        estado_debate.executar(this, config);
    }

    public void setsituacaodr(Boolean situacao) {
        this.situacaoDR = situacao;
    }

    public Boolean getsituacaodr() {
        return situacaoDR;
    }
}
