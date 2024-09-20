package services;

import model.Console;
import model.Save;
import repository.CenaDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComandoUsePregos extends ComandoCheckSapatilha{
    private Console console;
    private List<Console> listaConsole;

    public ComandoUsePregos() {
        this.console = new Console();
        this.listaConsole = new ArrayList<>();
    }

    public List<Console> executar() {
        try {
            CenaDAO cena = new CenaDAO();
            Save save = new Save();
            console.setMensagem(String.valueOf(CenaDAO.findCenaById(3).getDescricao()));
            listaConsole.add(console);
            return listaConsole;
        } catch (SQLException e) {
            console.setMensagem("erro ao tenta executar o comando");
            return listaConsole;
        }
    }
}
