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
        PoliticoColaborador sorteado = gerenciador_politicos.sortear();
        mediator_debate.setInquiridor(sorteado);
        logger.registrarlog(sorteado.getnome() + "foi sorteado como inquiridor");
    }

    public void selecionar_inquirido() {
        Scanner scanner = new Scanner(System.in);
        String nome;
        nome = scanner.nextLine();
        PoliticoColaborador inquirido = gerenciador_politicos.obter_nome(nome);
        InquiridorColaborador inquiridor = mediator_debate.getInquiridor();
        inquiridor.escolher_inquirido(inquirido);
        logger.registrarlog("o inquirido escolhido foi " + nome);

        
        
    }

    public void configuracaotempo(Integer[] tempos ) {
        for (Integer tempo : tempos) {
            configuracao.setpergunta(tempo);
            configuracao.setresposta(tempo);
            configuracao.setreplica(tempo);
            configuracao.settreplica(tempo);
            logger.registrarlog("O tempo foi configurado");
        }
    }

    public void inicardebate() {
        mediator_debate.debate(configuracao);
        logger.registrarlog("o debate foi iniciado...");
    }

    public void relatoriodebate() {
        logger.relatoriofinal();
    }

    public void cadastroeleitorfacade() {
        Scanner scanner = new Scanner(System.in);
        String nomepolitico;
        String nomeeleitor;

        System.out.println("Qual nome do eleitor?");
        nomeeleitor = scanner.nextLine();
        System.out.println("");
        System.out.println("Para qual politico sera a filiacao?");
        gerenciador_politicos.getpoliticos();
        nomepolitico = scanner.nextLine();
        System.out.println("");
        gerenciador_eleitor.adicionar_eleitor(nomeeleitor, gerenciador_politicos.obter_nome(nomepolitico));
    }

    public void mostrareleitores(String nome) {

        System.out.println("Eleitores de " + nome);
        gerenciador_politicos.eleitorescadastrados(nome);
    }
}
