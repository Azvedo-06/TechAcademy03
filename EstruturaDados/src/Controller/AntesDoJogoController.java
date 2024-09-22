package Controller;
import com.google.gson.Gson;
import services.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class AntesDoJogoController implements Route {
    private  static final  Gson gson = new Gson();

    public AntesDoJogoController(Gson gson) {
    }

    @Override
    public Object handle(Request request, Response response) throws Exception {
        String comandoBruto = request.params(":comando");
        String[] comandos = comandoBruto.split(" ");

        // comando de help
        if (comandos[0].equalsIgnoreCase("help")) {
            ComandoHelp comandoHelp = new ComandoHelp();
            return comandoHelp.executar();
        }
        //comando para começar o jogo
        if (comandos[0].equalsIgnoreCase("start")) {
            ComandoStart comandoStart = new ComandoStart();
            return gson.toJson(comandoStart.executar());
        }
        //comando para sair da primeira cena
        if (comandos[0].equalsIgnoreCase("use") && comandos[1].equalsIgnoreCase("sapatilha")) {
            ComandoCheckSapatilha comandoCheckSapatilha = new ComandoCheckSapatilha();
            return gson.toJson(comandoCheckSapatilha.executar());
        }
        //comando para sair da segunda cena
        if (comandos[0].equalsIgnoreCase("use")
                && comandos[1].equalsIgnoreCase("pregos")
                && comandos[2].equalsIgnoreCase("with")
                && comandos[3].equalsIgnoreCase("sapatilha")) {

            ComandoUsePregos comandoUsePregos = new ComandoUsePregos();
            return gson.toJson(comandoUsePregos.executar());
        }
        //comando para sair da terceira cena
        if (comandos[0].equalsIgnoreCase("use") && comandos[1].equalsIgnoreCase("documento")) {
            ComandoUseDoc comandoUseDoc = new ComandoUseDoc();
            return gson.toJson(comandoUseDoc.executar());
        }
        //comando para sair da quarta cena / final errado
        if (comandos[0].equalsIgnoreCase("use") && comandos[1].equalsIgnoreCase("bloco")) {
            ComandoFinal comandoFinal = new ComandoFinal();
            return gson.toJson(comandoFinal.executar());
        }
        //comando para sair da quinta cena / cena da conversa com a treinadora
        if (comandos[0].equalsIgnoreCase("use") && comandos[1].equalsIgnoreCase("carla")) {
            ComandoUseCarla comandoUseCarla = new ComandoUseCarla();
            return gson.toJson(comandoUseCarla.executar());
        }

        //comando ultima cena final certo
        if (comandos[0].equalsIgnoreCase("use") && comandos[1].equalsIgnoreCase("bloco")
                && comandos[2].equalsIgnoreCase("with") && comandos[3].equalsIgnoreCase("carla")) {
            ComandoFinalTrue comandoFinalTrue = new ComandoFinalTrue();
            return gson.toJson(comandoFinalTrue.executar());
        }


        return "Comando Desconhecido ou Errado: " + comandoBruto;
    }
}
