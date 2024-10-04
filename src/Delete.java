import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        int id=5;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Garethjr");
            Statement st = con.createStatement();
            int r=st.executeUpdate("DELETE FROM users where id = "+id);
            if(r>0)
                System.out.println("Deleted");
            st.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}
