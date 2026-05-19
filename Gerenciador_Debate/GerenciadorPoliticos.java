package Gerenciador_Debate;
import java.util.ArrayList;
import java.util.Random;
public class GerenciadorPoliticos {
    private ArrayList <PoliticoColaborador> politicos;
    public Integer contador = 0;


    public GerenciadorPoliticos(){
        politicos = new ArrayList<>();
    }

    public void adicionar_politico(String nome, Mediator mediator) {
        politicos.add(new PoliticoColaborador(nome, mediator));
    }

    public void getpoliticos() {
        for (PoliticoColaborador politico : politicos) {
            System.out.println(politico.getnome());
        }
    }

    public PoliticoColaborador sortear() {
        PoliticoColaborador sorteado;

        if (contador < politicos.size()) { 
            while(true) {
                Random random = new Random();
                int indice = random.nextInt(politicos.size());
                sorteado = politicos.get(indice);
                if (sorteado.getsorteado() == false) {
                    sorteado.setsorteado(true);
                    contador ++;
                    System.out.println("O sorteado foi " + sorteado.getnome() + " e deve escolher um dos candidatos para ser o inquirido:");
                    possibilidades_escolha(indice);
                    return sorteado;
                
                }
            }
        } else {
            System.out.println("Erro, todos os politicos já foram sorteados");
            return null;
        }
        
    }

    public void possibilidades_escolha(Integer indice) {
        for (Integer i = 0; i < politicos.size(); i++) {
            if (i != indice) {
                System.out.print(politicos.get(i).getnome()+ " / ");
            }
        }
    }


    public PoliticoColaborador obter_nome(String nome) {
        for (PoliticoColaborador politico : politicos) {
            if (politico.getnome().equals(nome)) {
                return politico;
            }
        } return null;
    }

    public void eleitorescadastrados(String nome) {
       this.obter_nome(nome).geteleitores();
    }



}
