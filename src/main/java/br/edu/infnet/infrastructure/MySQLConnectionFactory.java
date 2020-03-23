package br.edu.infnet.infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionFactory implements ConnectionFactory {

    private static ConnectionFactory _instance;

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/payroll?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private MySQLConnectionFactory() {
        _instance = this;
    }

    public static ConnectionFactory getInstance() {
        if (_instance != null) return _instance;
        return new MySQLConnectionFactory();
    }

    @Override
    public Connection connect() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
