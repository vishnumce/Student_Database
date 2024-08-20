buhimport java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createcon{
    public static void main(String[] args){
        try {
            String url="jdbc:mysql://localhost:3306/moon2";
            String username="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connected");

            //create a table
            String c_table="create table moon2(rno int primary key,firstname varchar(255),secondname varchar(255),subcode int ,subname varchar(255),mark int,percentage int not null)";
            Statement s=con.createStatement();
            s.executeUpdate(c_table);
            System.out.println("table created successfully");
        } 
        catch (SQLException s) {
            System.out.println(s);

        }

    }
}
