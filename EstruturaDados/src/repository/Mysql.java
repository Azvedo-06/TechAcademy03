package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
    private static Connection connection;

    public Mysql() {
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula_5", "root", "");
            return connection;
        } catch (SQLException var1) {
            SQLException e = var1;
            System.out.println(e.getMessage());
            System.out.println("Erro ao tentar conectar ao banco de dados");
        } catch (ClassNotFoundException var2) {
            System.out.println("Erro ao importar driver SQL");
        }

        return null;
    }
}