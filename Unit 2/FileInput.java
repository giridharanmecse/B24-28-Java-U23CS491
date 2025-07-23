import java.io.*;
import java.util.Scanner;
public class FileInput {
    public static void main(String args[]){
        File file = new File("sample.txt");
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String str  = sc.nextLine();
                lineCount++;
                String [] words = str.split(" ");
                wordCount = wordCount + words.length;
                 for(String w:words){
                    charCount = charCount+w.length();
                 }
                System.out.println(str);
            }
            System.out.println(lineCount + " "+ wordCount+" "+charCount);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
