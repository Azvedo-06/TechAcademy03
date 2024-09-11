import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Controller.AntesDoJogoController;
import com.google.gson.Gson;
import model.Cena;
import model.Item;
import model.Save;
import repository.CenaDAO;
import repository.ItemDAO;
import repository.SavaDAO;
import spark.Spark;

public class Main {
    public Main() {
    }

    private static final Gson GSON = new Gson();

    public static void main(String[] args) {

       try {
            Save save = SavaDAO.novoJogo();
            String saveJson = GSON.toJson(save);
            Spark.get("/", (req,res) -> saveJson);

            Spark.get("/", (req,res) -> {
                Integer cenaId = Integer.parseInt(req.params(":id"));
                Cena cena = CenaDAO.findCenaById(cenaId);
                return GSON.toJson(cena);
            });



           Spark.get("/:comando", new AntesDoJogoController());


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}