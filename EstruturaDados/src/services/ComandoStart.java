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

    public String executar() throws SQLException {
     return "Alison sempre foi apaixonado por atletismo. " +
             "Desde pequeno, Depois de anos de treinamento intenso e dedicação, " +
             "ele conseguiu chegar à final dos 400 metros rasos do Campeonato Nacional. " +
             "Alison está no vestiário preparar-se para a corrida, Vamos checar suas SAPATILHA...";
    }


    /* // o meu mySLQ caiu e eu perdi o banco de dados fiz um novo mais ele não estava mais pegando o save nem o texto de start
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
    */
}
