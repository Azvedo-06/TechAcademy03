package services;

import model.Console;
import model.Save;
import repository.CenaDAO;
import repository.SavaDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComandoRestart {
    private Console console;
    private List<Console> listaConsole;

    public ComandoRestart() {
        this.console = new Console();
        this.listaConsole = new ArrayList<>();
    }

    public String executar() {
        return " Alison sempre foi apaixonado por atletismo. " +
                " Desde pequeno, Depois de anos de treinamento intenso e dedicação, " +
                " ele conseguiu chegar à final dos 400 metros rasos do Campeonato Nacional. " +
                " Alison está no vestiário preparar-se para a corrida, Vamos colocar suas SAPATILHA...";

    }
}
