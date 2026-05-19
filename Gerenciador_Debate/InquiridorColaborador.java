package Gerenciador_Debate;
public class InquiridorColaborador extends PoliticoColaborador  {


    public InquiridorColaborador(PoliticoColaborador politico) { //copia os dados do politico colaborador
        super(politico.getnome(), politico.getmediator());
        this.setmicrofone(politico.getmicrofone());
        eleitores = politico.getlistaeleitores();

    }

    public void escolher_inquirido(PoliticoColaborador politico) {
        mediator.setInquirido(politico);
    }
    
}
