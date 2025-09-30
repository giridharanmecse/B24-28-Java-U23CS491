import java.sql.*;
public class Main {
    
    public static void main(String args[]){
        try{
            String url = "jdbc:mysql://localhost:3306/userdetails";
            String username = "root";
            String password = "root@123";
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println(con);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    /*
    AB : 1,5,11,12,14,17,18,19,22,26,38,40,42,43,46,47,49,51,52,55,57,58,62,63,65,
    OD : 2,15,25,28,64,
    
    Ab : 23,32,59,60,68,*/
    
}
