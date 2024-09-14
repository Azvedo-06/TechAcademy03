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
        console.setMensagem("HELP MENSAGEM");
        return console;
    }

    public Console start() {
        try {
            Save save = SavaDAO.novoJogo();
            console.setMensagem(save.getCenaAtual().getDescricao());
            console.setIdSave(save.getIdSave());
            return console;
        } catch (Exception e) {
            e.printStackTrace();
            console.setMensagem("Erro ao tentar iniciar o jogo");
            return console;
        }

    }

    public Console getResultConsole() {
        try {

            String primeiroComando = comando[0].toLowerCase();

            return switch (primeiroComando) {
                case "help" -> help();
                case "start" -> start();
                default -> {
                    console.setMensagem("Comando inválido");
                    yield console;
                }
            };
        } catch (Exception e) {
            console.setMensagem("Comando inválido");
            return console;
        }
    }
}
