import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String url = "jdbc:mysql://localhost:3306/studentdetails";
        String username = "root";
        String password = "root@123";
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println(con);
            con.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
