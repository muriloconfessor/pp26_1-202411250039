package Gerenciador_Debate;

public class Interface {
    public static void main(String[] args) {
        Facade facade = Facade.getInstance();

        facade.cadastrar_politico("Murilo");
        facade.cadastrar_politico("Maria");
        facade.cadastrar_politico("Carlos");

       
        Integer[] tempos = {8,8,4,4};
        facade.configuracaotempo(tempos);

        facade.cadastroeleitorfacade();
    
        facade.sortear();
        facade.selecionar_inquirido();
        facade.inicardebate();
    }
}