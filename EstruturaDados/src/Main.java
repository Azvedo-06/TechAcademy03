
import Controller.AntesDoJogoController;
import com.google.gson.Gson;
import spark.Spark;


public class Main {
    private static final Gson gson = new Gson();
    public static void main(String[] args) {

        Spark.get("/:comando",new AntesDoJogoController(gson));

    }
}