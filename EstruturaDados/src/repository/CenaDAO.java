package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cena;

public class CenaDAO {
    public CenaDAO() {
    }

    public static Cena findCenaById(Integer id) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "SELECT * FROM cenas WHERE id_cena = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Cena cena = new Cena();
        if (rs.next()) {
            cena.setId_cena(rs.getInt("id_cena"));
            cena.setDescricao(rs.getString("descricao"));
        }

        return cena;
    }
}