import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) {
            String name="Iniesta";
            int id=4;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Garethjr");
            PreparedStatement st = con.prepareStatement("UPDATE USERS SET name =? WHERE id=?");
            st.setString(1,name);
            st.setInt(2,id);
            int r= st.executeUpdate();
            if(r>0)
                System.out.println("Executed");
            st.close();
            con.close();
        }
        catch (SQLException e)
        {

            System.out.println("Error");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
