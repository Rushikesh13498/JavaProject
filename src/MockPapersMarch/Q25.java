package MockPapersMarch;
import java.sql.*;

public class Q25 {

	    public static void main(String[] args) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;

	        try {
	            // Create the database connection
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

	            // Create a prepared statement
	            preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");

	            // Set parameter values
	            preparedStatement.setInt(1, 123);

	            // Execute the query
	            resultSet = preparedStatement.executeQuery();

	            // Process the result set
	            while (resultSet.next()) {
	                // Process the row data
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");

	                // Do something with the data...
	            }
	        } catch (SQLException e) {
	            // Handle the exception
	            e.printStackTrace();
	        } finally {
	            // Close the database resources in the finally block
	            try {
	                if (resultSet != null) {
	                    resultSet.close();
	                }
	                if (preparedStatement != null) {
	                    preparedStatement.close();
	                }
	                if (connection != null) {
	                    connection.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

