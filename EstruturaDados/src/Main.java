
import Controller.AntesDoJogoController;
import Controller.DuranteOJogoController;
import com.google.gson.Gson;
import spark.Spark;


public class Main {
    private static final Gson gson = new Gson();
    public static void main(String[] args) {

        Spark.get("/:comando",new AntesDoJogoController(gson));
        //Spark.get("/:comando/:save", new DuranteOJogoController(gson));
    }
}