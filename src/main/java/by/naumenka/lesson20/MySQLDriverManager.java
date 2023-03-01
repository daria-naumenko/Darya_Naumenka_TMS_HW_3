package by.naumenka.lesson20;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDriverManager {
    private static final Logger logger = LogManager.getLogger(MySQLDriverManager.class);
    private static MySQLDriverManager instance;
    private static String URL = "jdbc:mysql://localhost:3306/tmsHw";
    private static String USERNAME = "root";
    private static String PASSWORD = "1111";

    private MySQLDriverManager() {
        init();
    }

    private void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            logger.error("Ошибка загрузки драйвера");
        }
    }

    public static MySQLDriverManager getInstance() {
        if (instance == null) {
            instance = new MySQLDriverManager();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}