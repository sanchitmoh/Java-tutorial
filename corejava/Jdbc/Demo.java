package Jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("This is a demo class for JDBC package");
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "admin";


        try {
            Class.forName(
                    "com.mysql.cj.jdbc.Driver");
            Connection connection = java.sql.DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
