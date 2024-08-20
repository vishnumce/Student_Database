import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
     public static void main(String[] args){
        try {
            String url="jdbc:mysql://localhost:3306/moon2";
            String username="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connected");

            String delete="delete from moon2 where rno=?";
            PreparedStatement pre=con.prepareStatement(delete);
            pre.setInt(1,25);
            pre.executeUpdate();
            System.out.println("delete successfully");
        }
        catch(SQLException s){
            System.out.println(s);
        }
    }
}

