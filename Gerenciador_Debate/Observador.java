package Gerenciador_Debate;
public class Observador {
    private String nome;
    private PoliticoColaborador politico;

    public Observador(String nome, PoliticoColaborador politico) {
        this.nome = nome;
        this.setpolitico(politico);
    }

    public void setpolitico(PoliticoColaborador politico){
        this.politico = politico;
    }

    public String getnomeeleitor() { return nome;}

    public void atualizar() {
        politico.getfala(nome);
        
    }

}
