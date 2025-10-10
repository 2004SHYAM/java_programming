import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb"; // Database name
        String username = "root";  // MySQL username
        String password = "1234";  // MySQL password

        try {
            // 1️⃣ Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Establish the connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connected to the database!");

            // 3️⃣ Create a Statement
            Statement stmt = con.createStatement();

            // 4️⃣ Execute a Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // 5️⃣ Process Results
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // 6️⃣ Close connection
            con.close();
            System.out.println("🔒 Connection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
