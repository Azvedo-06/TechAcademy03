package services;
import model.Cena;
import model.Console;
import model.Save;
import repository.CenaDAO;
import repository.SavaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComandoStart {
    private Console console;
    private List<Console> listaConsole;

    public ComandoStart() {
        this.console = new Console();
        this.listaConsole = new ArrayList<>();
    }

    public List<Console> executar() {
        try {
            CenaDAO cena = new CenaDAO();
            Save save = SavaDAO.novoJogo();
            console.setMensagem(save.getCenaAtual().getDescricao());
            console.setIdSave(save.getIdSave());
            listaConsole.add(console);
            return listaConsole;

        } catch (SQLException e) {
            console.setMensagem("Houve um erro ao tentar iniciar o jogo");
            listaConsole.add(console);
            return listaConsole;
        }
    }
}
