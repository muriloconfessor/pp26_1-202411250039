package Gerenciador_Debate;
public class MicrofoneCronometro {
    private Boolean microfoneAtivo;
    private PoliticoColaborador politico;
    private Boolean DR;

    public MicrofoneCronometro(PoliticoColaborador politico) {
        this.politico = politico;
        DR = false;
    }

    public void Ativar() {microfoneAtivo = true;}
    public void Desativar() {microfoneAtivo = false;}
    public void Esperar(Integer tempo) {
        try {
            Thread.sleep(tempo * 1000);
        } catch (InterruptedException e) {

        }
    }

    public void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }
    public void solicitarDR() {
        if (politico.getmediator().getsituacaodr()) {
            System.out.println("Não é possivel solicitar DR durante uma DR");
            return;
        } else {
            politico.getmediator().adicionarsolicitacaodr(politico);
        }

    }



}
