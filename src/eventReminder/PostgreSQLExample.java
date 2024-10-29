/**
 * 
 */
package eventReminder;

/**
 * @author timcu
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String jdbcUrl = "jdbc:postgresql://cullison-lab.net:5432/event_reminder";
        String username = "admin";
        String password = "team2@UMGC";
            
        // Register the PostgreSQL driver
        Class.forName("org.postgresql.Driver");
        
        // Connect to the database
        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
        
        // Perform desired database operations
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

        while (resultSet.next())
        {
            String columnValue = resultSet.getString("email");
            System.out.println("Column Value: " + columnValue);
        }
        
        // Close the connection
        connection.close();
    }
}
