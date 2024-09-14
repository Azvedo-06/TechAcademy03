package Controller;

import com.google.gson.Gson;
import services.ComandoService;
import spark.Request;
import spark.Response;
import spark.Route;

public class AntesDoJogoController implements Route {


    private final Gson gson;
    public AntesDoJogoController(Gson gson) {
        this.gson = gson;
    }

    @Override
    public Object handle(Request request, Response response) throws Exception {
        String comandoBruto = request.params(":comando");

        ComandoService comandoService = new ComandoService(comandoBruto);
        Gson gson = new Gson();
        return gson.toJson(comandoService.getResultConsole());
    }
}
