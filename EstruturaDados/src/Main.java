import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import model.Cena;
import model.Item;
import repository.CenaDAO;
import repository.ItemDAO;
import spark.Spark;

public class Main {
    public Main() {
    }

    private static final Gson GSON = new Gson();

    public static void main(String[] args) {

       try {
            Cena cena = CenaDAO.findCenaById(2);
            List<Item> item = ItemDAO.findItemByScena(cena);

           List<String> cenaEitens = new ArrayList<>();
           String cenaJson;
           String itemJson;
           cenaEitens.add(cenaJson = GSON.toJson(cena));
           cenaEitens.add(itemJson = GSON.toJson(item));

           Spark.get("/", (req, res) -> cenaEitens);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}