package Gerenciador_Debate;

import java.util.ArrayList;

public class Mediator {

    public Mediator() {}

    public void debate(){}
    public void setInquiridor(PoliticoColaborador politico){}
    public void setInquirido(PoliticoColaborador politico) {}
    public void adicionarsolicitacaodr(PoliticoColaborador politico) {}
    public void analisarsolicitacaodr() {}
    public void debate_comum(Configuracao configuracao) {}
    public void debate_resposta(Configuracao config) {}
    public void setestado_debate(EstadosDebate estado) {}
    public void setsituacaodr(Boolean situacao) {}
    public Boolean getsituacaodr() {return null;}
    public ArrayList<PoliticoColaborador> getsolicitacaoconcedida() {
        return null;
    }
    public PoliticoColaborador getInquiridor(){
        return null;
    }

    public PoliticoColaborador getInquirido() {
        return null;
    }

    public void debate(Configuracao configuracao) {}

}
