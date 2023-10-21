package Week4LAB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/CHANGE";
    private static final String USERNAME = "CHANGE";
    private static final String PASSWORD = "CHANGE";


    private Connection connection = null;


    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

