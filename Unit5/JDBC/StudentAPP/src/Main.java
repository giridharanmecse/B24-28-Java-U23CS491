import java.sql.*;
public class Main {
    public static void main(String args[]){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "root@123");
            Statement stm = con.createStatement();
            String query1 = "insert into student values (1,'Arun','898989');";
            stm.executeUpdate(query1);
            System.out.println(con);
            con.close();
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
