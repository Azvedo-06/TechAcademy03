import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
            Cena cena = CenaDAO.findCenaById(1);
            List<Item> item = ItemDAO.findItemByScena(cena);


            Save save = SavaDAO.novoJogo();
            String saveJson = GSON.toJson(save);


           List<String> cenaEitens = new ArrayList<>();
           String cenaJson;
           String itemJson;
           cenaEitens.add(cenaJson = GSON.toJson(cena));
           cenaEitens.add(itemJson = GSON.toJson(item));

           Spark.get("/", (req, res) -> cenaEitens);

           ;
           System.out.println("-----save-do-jogo-----");
           System.out.println(save.getCenaAtual().getDescricao());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}