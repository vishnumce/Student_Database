import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/moon2";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");

            // Update statement
            String update = "UPDATE moon2 SET firstname=?, secondname=?, subcode=?, subname=?, mark=?, percentage=? WHERE rno=?";
            PreparedStatement updateStmt = con.prepareStatement(update);
            updateStmt.setString(1, "kaviya"); // firstname
            updateStmt.setString(2, "Ravi"); // secondname
            updateStmt.setInt(3, 112); // subcode
            updateStmt.setString(4, "Science"); // subname
            updateStmt.setInt(5, 85); // mark
            updateStmt.setInt(6, 85); // percentage
            updateStmt.setInt(7, 1); // rno
            updateStmt.executeUpdate();
            System.out.println("Updated successfully");

        } catch (SQLException s) {
            System.out.println(s);
        }
    }
}
