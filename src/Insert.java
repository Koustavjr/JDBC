import java.sql.*;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id="5";
        String name="Xavi";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Garethjr");

        /*    Statement st= con.createStatement();
            String query="INSERT INTO users VALUES("+id+"," +
                    "'"+name+ "')";
          int row=   st.executeUpdate(query);
          if(row>0)
              System.out.println("Executed");*/

            // using prepared statement

            PreparedStatement st = con.prepareStatement("INSERT INTO users VALUES(?,?)");
            st.setInt(1,Integer.parseInt(id));
            st.setString(2,name);
           st.executeUpdate();
            System.out.println("Executed succesfully");

            st.close();


        }
        catch (Exception e)
        {
            System.out.println("error");
        }

    }
}
