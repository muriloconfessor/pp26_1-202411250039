package Gerenciador_Debate;

public class Director {
    public void construir(ConfiguracaoBuilder builder) {
        builder.tempopergunta();
        builder.temporesposta();
        builder.temporeplica();
        builder.tempotreplica();
        builder.tempodr();
    }


}
