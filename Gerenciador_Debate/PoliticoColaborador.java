package Gerenciador_Debate;
import java.util.ArrayList;
public class PoliticoColaborador {
    private String Nome;
    private Boolean Sorteado = false;
    private MicrofoneCronometro Microfone;
    protected Mediator mediator;
    protected ArrayList <Observador> eleitores;


    public PoliticoColaborador(String nome, Mediator mediator) {
        Nome = nome;
        this.setmediator(mediator);
        eleitores = new ArrayList<>();
    }

    public void setmediator (Mediator mediator) {this.mediator = mediator;}
    public void setmicrofone(MicrofoneCronometro microfone) {Microfone = microfone;}
    public void setsorteado(Boolean sorteado) {Sorteado = sorteado;}

    public String getnome() {return Nome;}
    public MicrofoneCronometro getmicrofone() {return Microfone;}
    public Mediator getmediator() {return mediator;}
    public Boolean getsorteado() {return Sorteado;}

    public void falar(Integer tempo) {
        Microfone.delay();
        Microfone.Ativar();
        System.out.println("Cronometro iniciado...");
        System.out.println(this.getnome() + " esta falando");
        this.notificar();
        Microfone.Esperar(tempo);
        System.out.println("Tempo esgotado.");
        Microfone.Desativar();
        Microfone.delay();
    }

    public void cadastrareleitor(Observador eleitor) {
        eleitores.add(eleitor);
    }

    public void geteleitores() {
        for (Observador eleitor : eleitores) {
            System.out.println(eleitor.getnomeeleitor());
        }
    }

    public void getfala(String nome) {    //mensagem para o observer
        
        System.out.println(nome + " Seu candidato está falando");
    }

    public void notificar() {
        for (Observador eleitor :  eleitores) {
            eleitor.atualizar();
        }
    }

    public ArrayList <Observador> getlistaeleitores() {
        return new ArrayList<>(this.eleitores);
    }



}
