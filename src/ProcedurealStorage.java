import java.sql.*;

public class ProcedurealStorage {
    public static void main(String[] args) {

       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Garethjr");
           //CallableStatement st = con.prepareCall("{call simple()}");

           //CallableStatement st = con.prepareCall("{call simple(?)}");
           //st.setInt(1,30);

           CallableStatement st = con.prepareCall("{call simple(?,?)}");
           st.setInt(1,30);
           st.registerOutParameter(2, Types.INTEGER);


           boolean res=st.execute();
           int count =st.getInt(2);
           if(res)
           {
               ResultSet rs=st.getResultSet();
               while(rs.next())
               {
                   String name =rs.getString("name");

                   System.out.println(name);
                   System.out.println(count);
               }
           }
           st.close();
           con.close();

       }
       catch (Exception  e)
       {
           System.out.println("Error");
       }
       }
}
