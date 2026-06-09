package Gerenciador_Debate;

import java.util.ArrayList;

public class Sujeito {
    protected ArrayList <Observador> eleitores;

    public Sujeito() {
        eleitores = new ArrayList<>();
    }


    public void cadastrareleitor(Observador eleitor) {
        eleitores.add(eleitor);
    }
    public void geteleitores() {
        for (Observador eleitor :  eleitores) {
            System.out.println(eleitor.getnomeeleitor());
        }
    }
    public void notificar() {
        for (Observador eleitor :  eleitores) {
            eleitor.atualizar();
        }
    }
    public ArrayList <Observador> getlistaeleitores() {
        return new ArrayList<>(this.eleitores);
    }

    public void getfala(String nome) {    //mensagem para o observer
        
        System.out.println(nome + " Seu candidato está falando");
    }
}
