package Gerenciador_Debate;
import java.util.ArrayList;

public class Logger {
    private static Logger instance = null;
    private ArrayList <String> relatorio;


    private Logger() {
        relatorio = new ArrayList<>();
    }

    public static  Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        } else {} return instance;
    }


    public void registrarlog(String info) {
        relatorio.add(info);
    }

    public void relatoriofinal() {
        for (String registro : relatorio) {
            System.out.println(registro);
        }
    }
}
