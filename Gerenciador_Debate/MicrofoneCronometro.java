package Gerenciador_Debate;
public class MicrofoneCronometro {
    private Boolean microfoneAtivo;

    public MicrofoneCronometro() {}

    public void Ativar() {microfoneAtivo = true;}
    public void Desativar() {microfoneAtivo = false;}
    public void Esperar(Integer tempo) {
        try {
            Thread.sleep(tempo * 1000);
        } catch (InterruptedException e) {

        }
    }

    public void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }

}
