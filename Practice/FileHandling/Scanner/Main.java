
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("sample.txt");
        Scanner sc =new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        System.out.println("Welcome to the File Handling Scanner Example!");
        
        
    }
    
}
