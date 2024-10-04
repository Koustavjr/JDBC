import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {
    public static void main(String[] args) {
        String query= """
                Create Table users2
                (
                id INT PRIMARY KEY,
                name VARCHAR(20),
                age INT
                );
                """;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Garethjr");
            PreparedStatement st = con.prepareStatement(query);
            st.executeUpdate();
            st.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}
