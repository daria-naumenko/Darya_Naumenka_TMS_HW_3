package by.naumenka.lesson20;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws SQLException {
        MySQLDriverManager driverManager = MySQLDriverManager.getInstance();
        Connection connection = driverManager.getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        Statement preparedStatement = null;
        ResultSet preparedResultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()) {

                System.out.print(resultSet.getInt("id") + "\t");
                System.out.print(resultSet.getString("name") + "\t");
                System.out.print(resultSet.getString("lastname") + "\t");
                System.out.println(resultSet.getInt("age"));
            }
        } catch (Exception e) {
            logger.error("Ошибка в таблице студент !!!");
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
        }

        try {
            preparedStatement = connection.createStatement();
            preparedResultSet = preparedStatement.executeQuery("select * from cities");

            while (preparedResultSet.next()) {
                System.out.print(preparedResultSet.getInt("id_cities") + "\t");
                System.out.print(preparedResultSet.getString("name_cities") + "\t");
                System.out.println(preparedResultSet.getString("population"));
            }
        } catch (Exception e) {
            logger.error("Ошибка в таблице городов !!!");
        } finally {
            if (preparedResultSet != null) {
                preparedResultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}