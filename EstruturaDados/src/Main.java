import java.sql.SQLException;
import model.Cena;
import repository.CenaDAO;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            Cena cena = CenaDAO.findCenaById(0);
            System.out.println(cena.toString());
        } catch (SQLException var2) {
            SQLException e = var2;
            throw new RuntimeException(e);
        }
    }
}