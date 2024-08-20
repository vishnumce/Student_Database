import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/moon2";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection success");

            // Insert data into the table
            String insert = "INSERT INTO moon2 (rno, firstname, secondname, subcode, subname, mark, percentage) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = con.prepareStatement(insert);
            pre.setInt(1, 2); // rno
            pre.setString(2, "vishnu"); // firstname
            pre.setString(3, "senthi"); // secondname
            pre.setInt(4, 111); // subcode
            pre.setString(5, "science"); // subname
            pre.setInt(6, 95); // mark
            pre.setInt(7, 95); // percentage
            pre.executeUpdate();
            System.out.println("Inserted successfully");

        } catch (SQLException s) {
            System.out.println(s);
        }
    }
}
