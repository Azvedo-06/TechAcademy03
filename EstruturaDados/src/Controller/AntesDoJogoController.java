package Controller;
import com.google.gson.Gson;
import services.ComandoCheckSapatilha;
import services.ComandoHelp;
import services.ComandoStart;
import services.ComandoUsePregos;
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

        if (comandos[0].equalsIgnoreCase("help")) {
            ComandoHelp comandoHelp = new ComandoHelp();
            return comandoHelp.executar();
        }

        if (comandos[0].equalsIgnoreCase("start")) {
            ComandoStart comandoStart = new ComandoStart();
            return gson.toJson(comandoStart.executar());
        }

        if (comandos[0].equalsIgnoreCase("use") && comandos[1].equalsIgnoreCase("sapatilha")) {
            ComandoCheckSapatilha comandoCheckSapatilha = new ComandoCheckSapatilha();
            return gson.toJson(comandoCheckSapatilha.executar());
        }

        if (comandos[0].equalsIgnoreCase("use")
                && comandos[1].equalsIgnoreCase("pregos")
                && comandos[2].equalsIgnoreCase("with")
                && comandos[3].equalsIgnoreCase("sapatilha")) {

            ComandoUsePregos comandoUsePregos = new ComandoUsePregos();
            return gson.toJson(comandoUsePregos.executar());
        }

        return "Comando Desconhecido ou Errado: " + comandoBruto;
    }
}
