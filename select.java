import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class select {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/moon2";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successfully");

            String fetch = "SELECT rno, firstname, secondname, subcode, subname, mark, percentage FROM moon1 WHERE rno=?";
            PreparedStatement pre = con.prepareStatement(fetch);
            pre.setInt(1, 40);
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                int rno = rs.getInt("rno");
                String firstname = rs.getString("firstname");
                String secondname = rs.getString("secondname");
                int subcode = rs.getInt("subcode");
                String subname = rs.getString("subname");
                int mark = rs.getInt("mark");
                int percentage = rs.getInt("percentage");

                System.out.println("Rno: " + rno + ", Firstname: " + firstname + ", Secondname: " + secondname + 
                                   ", Subcode: " + subcode + ", Subname: " + subname + 
                                   ", Mark: " + mark + ", Percentage: " + percentage);
            }
            System.out.println("Select successfully");
        } catch (Exception s) {
            System.out.println(s);
        }
    }
}
