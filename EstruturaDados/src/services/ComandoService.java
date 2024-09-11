package services;

import model.Cena;
import model.Console;
import model.Save;
import repository.SavaDAO;

import java.sql.SQLException;

public class ComandoService {

    private String[] comando;
    private Console console;

    public ComandoService(String comandoBruto) {
        Console console = new Console();
        this.console = console;
        this.comando = comandoBruto.split(" ");

    }

    public Console help() {
        Console console = new Console();
        console.setMensagem("HELP MENSAGEM");
        return console;
    }

    public Console start() {
        try {
            Save save = SavaDAO.novoJogo();
            console.setIdSave(save.getIdSave());
            console.setMensagem(save.getCenaAtual().getDescricao());
            return console;
        } catch (Exception e) {
            e.printStackTrace();
            console.setMensagem("Erro ao tentar iniciar o jogo");
            return console;
        }

    }

    public Console getResultConsole() {
        Console console = new Console();
        try {
            switch (comando[0].toLowerCase()) {
                case "help":
                    return help();
                case "start":
                    return start();

                default:
                    console.setMensagem("Comando Invalido");
                    return console;
            }
        }catch (Exception e) {
            e.printStackTrace();
            return console;
        }
    }
}
