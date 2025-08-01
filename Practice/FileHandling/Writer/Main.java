import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main{
    public static void main(String[] args) {
        
        try{
            FileWriter writter = new FileWriter("sample.txt",false);
            BufferedWriter bw = new BufferedWriter(writter);
            PrintWriter pw = new PrintWriter(bw);
            pw.println("Welcome to Java Programming!");            
            pw.println("We are learning file handling in Java.");
            pw.println("File handling in Java is easy.");
            bw.close();
            writter.close();
            pw.close();
            System.out.println("File written successfully.");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}