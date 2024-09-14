package repository;
import model.Cena;
import model.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {
    public static Item findItemById(String itemId) {
        return new Item();
    }

    public static List<Item> findItemByScena(Cena cena) throws SQLException {
        Connection connection = Mysql.getConnection();
        String sql = "SELECT * FROM itens i WHERE id_cena_atual = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, cena.getId_cena());
        ResultSet resultSet = ps.executeQuery();

        List<Item> itens = new ArrayList<>();
        while (resultSet.next()) {
            Item item = new Item();
            item.setIdItem(resultSet.getInt("id_item"));
            item.setNome(resultSet.getString("nome"));

            Integer idCenaAtual = resultSet.getInt("id_cena_atual");


            item.setIdcenaAtual(idCenaAtual);

            itens.add(item);
        }

        return itens;
    }
}

