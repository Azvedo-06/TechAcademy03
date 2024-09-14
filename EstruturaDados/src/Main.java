
import com.google.gson.Gson;
import model.Save;
import repository.CenaDAO;
import repository.SavaDAO;
import spark.Spark;

public class Main {
    private static final Gson gson = new Gson();
    public static void main(String[] args) {
            try {
                Save save = SavaDAO.novoJogo();
                String saveJson = gson.toJson(save);

                Spark.get("/", (req,res) -> saveJson );

                Spark.get("cena/:id", (req,res) -> {
                    Integer idCena = Integer.parseInt(req.params(":id"));
                    return gson.toJson(CenaDAO.findCenaById(idCena));
                });

                //Spark.get("/:comando", new DuranteOJogoController(gson));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }
}