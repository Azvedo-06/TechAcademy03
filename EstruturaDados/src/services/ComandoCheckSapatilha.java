package services;

import model.Console;
import model.Save;
import repository.CenaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComandoCheckSapatilha {
    private Console console;
    private List<Console> listaConsole;

    public ComandoCheckSapatilha() {
        this.console = new Console();
        this.listaConsole = new ArrayList<>();
    }

    public List<Console> executar() throws SQLException {
        try {
            CenaDAO cena = new CenaDAO();
            Save save = new Save();
            console.setMensagem(String.valueOf(CenaDAO.findCenaById(2).getDescricao()));
            listaConsole.add(console);
            return listaConsole;
        } catch (SQLException e) {
            console.setMensagem("erro ao tenta executar o comando");
            return listaConsole;
        }
    }
}
