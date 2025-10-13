import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String args[]){
        System.out.println("Hello");
        String url = "jdbc:mysql://localhost:3306/studentdetails";
        String username = "root";
        String password = "root@123";
        try(Connection con = DriverManager.getConnection(url,username,password)){
            System.out.println(con);
            System.out.println("Connection Established");
            try(Statement stm = con.createStatement()){
                String query = "select * from student";
                ResultSet rs = stm.executeQuery(query);
                while(rs.next()){
                    System.out.println("id = "+rs.getInt(1)+" Name = "+rs.getString(2));
                }
                query = "insert into student values(2,'Banu','89898')";
                stm.executeUpdate(query);
                System.out.println("data insertes");

                query = "select * from student";
                rs = stm.executeQuery(query);
                while(rs.next()){
                    System.out.println("id = "+rs.getInt(1)+" Name = "+rs.getString(2));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
