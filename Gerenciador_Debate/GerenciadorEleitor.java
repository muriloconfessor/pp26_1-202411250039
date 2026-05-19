package Gerenciador_Debate;
import java.util.ArrayList;
public class GerenciadorEleitor {
    private ArrayList <Observador>  eleitores;



    public GerenciadorEleitor() {
        eleitores = new ArrayList<>();
    }



    public void adicionar_eleitor(String nome, PoliticoColaborador politico) {
        
        eleitores.add(new Observador(nome, politico));
        politico.cadastrareleitor(this.buscareleitor(nome));
    }

    public Observador buscareleitor(String nome) {
        for (Observador eleitor : eleitores) {
            if (eleitor.getnomeeleitor().equals(nome)) {
                return eleitor;
            } else {
                System.out.println("Eleitor não encontrado");
            }
        }return null;
    }
}
