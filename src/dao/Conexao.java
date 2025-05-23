package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static Connection conectar() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/rede_educacional";
            String user = "root";
            String password = "senha"; // tem q criar a senha aqui

            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
