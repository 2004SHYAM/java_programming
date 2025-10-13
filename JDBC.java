// ...existing code...
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        String url = System.getenv().getOrDefault("DB_URL", "jdbc:mysql://localhost:3306/schooldb");
        String username = System.getenv().getOrDefault("DB_USER", "root");
        String password = System.getenv().getOrDefault("DB_PASS", "1234");

        String driver = null;
        if (url.startsWith("jdbc:oracle:")) driver = "oracle.jdbc.OracleDriver";
        else if (url.startsWith("jdbc:mysql:")) driver = "com.mysql.cj.jdbc.Driver";

        try {
            if (driver != null) Class.forName(driver);

            try (Connection con = DriverManager.getConnection(url, username, password);
                 Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

                System.out.println("Connected to: " + url);
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
                }
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC driver class not found for URL: " + url + ". Add the appropriate JDBC JAR to the classpath.");
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}