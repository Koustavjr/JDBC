import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try{
            //1  load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2 establish connection
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Garethjr");
            // create statement object
            Statement st = con.createStatement();
            // Execute a query
            ResultSet rs= st.executeQuery("SELECT * FROM users");
            // process query
            while (rs.next())
            {
                System.out.print(rs.getInt(1)+" ");
                System.out.println(rs.getString(2));
            }

            System.out.println("Connection Established!");
        }
        catch (Exception e)
        {
            System.out.println("Cannot establish connection!");
        }
    }
}