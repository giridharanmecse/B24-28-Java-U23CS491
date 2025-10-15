import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        try{
        do{
            age = sc.nextInt();
            if(age>=18){
                System.out.println("Cast your vote");
            } else {
                
                throw new AgeInvalidException("You are not eligible to vote");
               
            }
        } while(true);
         } catch (Exception e){
            System.out.println(e);
        }
        finally{
            sc.close();

        }
        
    }
}
