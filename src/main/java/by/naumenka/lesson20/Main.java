package by.naumenka.lesson20;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws SQLException {
        MySQLDriverManager driverManager = MySQLDriverManager.getInstance();
        Connection connection = driverManager.getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию студента: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите возраст студента: ");
        int age = scanner.nextInt();

        try {
            String insertQuery = "INSERT INTO student (name, lastname, age) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, age);
            int addStudent = preparedStatement.executeUpdate();
            logger.info(addStudent + "Новый студент добавлен успешно!");
        } catch (Exception e) {
            logger.error("Ошибка добавления нового студента в бд: " + e.getMessage());
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
            scanner.close();
        }

        try {
            preparedResultSet = statement.executeQuery("select * from cities");

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
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}