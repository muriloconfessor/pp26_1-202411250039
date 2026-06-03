package Gerenciador_Debate;
import java.util.Scanner;
public class Facade {
    private static Facade instance = null;
    private Mediator mediator_debate;
    private Configuracao configuracao;
    private GerenciadorPoliticos gerenciador_politicos;
    private Logger logger;
    private GerenciadorEleitor gerenciador_eleitor;
    



    private Facade() {
        mediator_debate = new MediatorDebate();
        configuracao = new Configuracao();
        gerenciador_politicos = new GerenciadorPoliticos();
        gerenciador_eleitor = new GerenciadorEleitor();
        logger = Logger.getInstance();
        logger.registrarlog("Fachada iniciada");
        
    }

    public static Facade getInstance() {    //singleton que garante instancia unica da fachada
        if (instance == null) {
            instance = new Facade();
        } else {
            System.out.println("Fachada ja instanciada");
        } 
        return instance;
    }

    public void cadastrar_politico(String nome) {
        gerenciador_politicos.adicionar_politico(nome, this.mediator_debate);
    }

    public void politicos_cadastrados() {
        gerenciador_politicos.getpoliticos();
    }

    public void sortear() {
        mediator_debate.setInquiridor(gerenciador_politicos.sortear());
        PoliticoColaborador inquiridor = mediator_debate.getInquiridor();
        inquiridor.escolher_inquirido(gerenciador_politicos.sortear_inquirido(inquiridor));
        logger.registrarlog(inquiridor.getnome() + " foi sorteado como inquiridor" + " e " + mediator_debate.getInquirido().getnome() + " foi sorteado como inquirido");
    }



    /*public void configuracaotempo(Integer[] tempos ) { extrutura anterior
        for (Integer tempo : tempos) {
            configuracao.setpergunta(tempo);
            configuracao.setresposta(tempo);
            configuracao.setreplica(tempo);
            configuracao.settreplica(tempo);
            logger.registrarlog("O tempo foi configurado");
        }
    }
    */

    public void configuracaotempo(Configuracao configuracao) {
        this.configuracao = configuracao;
        logger.registrarlog("O tempo foi configurado");
        }
    

    public void inicardebate() {
        mediator_debate.debate(configuracao);
        logger.registrarlog("o debate foi iniciado...");
    }

    public void relatoriodebate() {
        logger.relatoriofinal();
    }

    public void cadastroeleitorfacade(String nomeeleitor, String nomepolitico) {
        gerenciador_eleitor.adicionar_eleitor(nomeeleitor, gerenciador_politicos.obter_nome(nomepolitico));
    }

    public void mostrareleitores(String nome) {

        System.out.println("Eleitores de " + nome);
        gerenciador_politicos.eleitorescadastrados(nome);
    }
}
