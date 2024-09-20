package Controller;

import com.google.gson.Gson;
import services.ComandoHelp;
import services.ComandoStart;
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

        if (comandos[0].equalsIgnoreCase("check")) {

        }

        return "O comando digitado foi: " + comandos[0] + " e o argumento " + comandos[1];
    }
}
