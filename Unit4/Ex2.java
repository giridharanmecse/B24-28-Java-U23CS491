import java.io.IOException;

public class Ex2 {
    public static void main(String args[]){
        main2();
    }

    public static void main2(){
        try{
        main3();
        } catch (Exception e){
            System.out.println("Exception handlied in Main 2");
        }
    }

    public static void main3() throws IOException{
        //System.out.println(5/0);
        
        throw new IOException();
       
    }
}
