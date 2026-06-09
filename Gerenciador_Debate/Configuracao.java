package Gerenciador_Debate;
public class Configuracao {
    protected Integer pergunta;
    protected Integer resposta;
    protected Integer replica;
    protected Integer treplica;
    protected Integer dr;

    public Configuracao() {}

    public void setpergunta(Integer pergunta) {this.pergunta = pergunta;}
    public void setresposta(Integer resposta) {this.resposta = resposta;}
    public void setreplica(Integer replica) {this.replica = replica;}
    public void settreplica(Integer treplica) {this.treplica = treplica;}
    public void setdr(Integer dr) {this.dr = dr;}

    public Integer getpergunta() {return pergunta;}
    public Integer getresposta() {return resposta;}
    public Integer getreplica() {return replica;}
    public Integer gettreplica() {return treplica;}
    public Integer getdr() {return dr;}
}
