package Gerenciador_Debate;

public class Interface {
    public static void main(String[] args) {
        Facade facade = Facade.getInstance();

        facade.cadastrar_politico("Murilo");
        facade.cadastrar_politico("Maria");
        facade.cadastrar_politico("Carlos");

        Director director = new Director();
        ConfiguracaoBuilder configuracaopadrao = new ConfiguracaoConcreta();
        director.construir(configuracaopadrao);
        ConfiguracaoBuilder configuracaopadrao02 = new ConfiguracaoConcreta02();
        director.construir(configuracaopadrao02); 


       
        //Integer[] tempos = {4,4,2,2} extrutura anterior
        facade.configuracaotempo(configuracaopadrao.getconfiguracaco());
        facade.cadastroeleitorfacade("Joao", "Murilo");
        facade.cadastroeleitorfacade("jose", "Maria");

        
        facade.gerarDR();
        facade.sortear();
        facade.inicardebate();
        facade.gerarDR();
        facade.relatoriodebate();
        
    }
}