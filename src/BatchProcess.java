import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BatchProcess {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Garethjr");
           /* Statement st = con.createStatement();
            st.addBatch("INSERT INTO users2 VALUES(1,'abc',25)");
            st.addBatch("INSERT INTO users2 VALUES(2,'def',21)");
            st.addBatch("INSERT INTO users2 VALUES(3,'ghi',29)");
         int[]arr=st.executeBatch();
         for(int i:arr)
             System.out.println(i);*/

            // prepared statement
            PreparedStatement st = con.prepareStatement("INSERT INTO users2 VALUES(?,?,?)");
            st.setInt(1,4);
            st.setString(2,"jkl");
            st.setInt(3,31);
            st.addBatch();
            st.setInt(1,5);
            st.setString(2,"mno");
            st.setInt(3,36);
            st.addBatch();

            st.executeBatch();

            st.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}
