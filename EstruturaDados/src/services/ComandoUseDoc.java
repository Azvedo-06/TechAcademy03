package services;

import model.Console;
import model.Save;
import repository.CenaDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComandoUseDoc {
    private Console console;
    private List<Console> listaConsole;

    public ComandoUseDoc() {
        this.console = new Console();
        this.listaConsole = new ArrayList<>();
    }

    public List<Console>executar() {
        try {
            CenaDAO cena = new CenaDAO();
            Save save = new Save();
            console.setMensagem(String.valueOf(CenaDAO.findCenaById(4).getDescricao()));
            listaConsole.add(console);
            return listaConsole;
        } catch (SQLException e) {
            console.setMensagem("erro ao tenta executar o comando");
            return listaConsole;
        }
    }
}
