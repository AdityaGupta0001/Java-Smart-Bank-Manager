package signup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/credecio";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Specify the SQL query to retrieve a particular row from the table
            String sqlQuery = "SELECT * FROM userdata WHERE username = 'Aditya'"; // Replace with your column and table names

            // Create a PreparedStatement object to execute the query
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                // Set the parameter for the PreparedStatement (assuming 'id' is the primary key)
                //x`    preparedStatement.setInt(1, 1); // Replace with the actual value you want to retrieve

                // Execute the query and get the ResultSet
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Check if the ResultSet has data
                    if (resultSet.next()) {
                        // Get the number of columns in the ResultSet
                        int columnCount = resultSet.getMetaData().getColumnCount();

                        // Create an array to store the row data
                        Object[] rowData = new Object[columnCount];

                        // Retrieve column values and store them in the array
                        for (int i = 1; i <= columnCount; i++) {
                            rowData[i - 1] = resultSet.getObject(i);
                        }

                        // Print or use the rowData array as needed
                        System.out.println("Row Data: " + java.util.Arrays.toString(rowData));
                    } else {
                        System.out.println("No data found for the specified condition.");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection in the finally block to ensure it's always closed
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
