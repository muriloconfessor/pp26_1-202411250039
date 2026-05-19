package Gerenciador_Debate;
public class InquiridoColaborador extends PoliticoColaborador {

    public InquiridoColaborador(PoliticoColaborador politico) {
        super(politico.getnome(), politico.getmediator());
        this.setmicrofone(politico.getmicrofone());
        eleitores = politico.getlistaeleitores();
    }

    
}
