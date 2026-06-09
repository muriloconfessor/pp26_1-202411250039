package Gerenciador_Debate;
import java.util.ArrayList;
public class PoliticoColaborador extends Sujeito implements Cloneable{
    private String Nome;
    private Boolean Sorteado = false;
    private MicrofoneCronometro Microfone;
    protected Mediator mediator;


    public PoliticoColaborador(String nome, Mediator mediator) {
        super();
        Nome = nome;
        this.setmediator(mediator);
        this.Microfone = new MicrofoneCronometro(this);
        
    }

    public void setmediator (Mediator mediator) {this.mediator = mediator;}
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


    @Override

    public PoliticoColaborador clone() {
        try {
            PoliticoColaborador copia = (PoliticoColaborador) super.clone();
            new ArrayList<>(this.eleitores);
            return copia;

        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void escolher_inquirido(PoliticoColaborador politico) {
        mediator.setInquirido(politico);
    }

    public void solicitarDR() {
        Microfone.solicitarDR();
    }


}
