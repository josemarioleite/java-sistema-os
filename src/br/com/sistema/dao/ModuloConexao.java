package br.com.sistema.dao;

import java.sql.*;

public class ModuloConexao {
    public static Connection conector() {
        Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://172.17.0.2:3306/dbinfo";
        String user = "root";
        String password = "101010";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
