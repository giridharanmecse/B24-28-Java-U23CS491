class B{
    public B(){
    System.out.println("Hai from B Constructor");
    }

    public static void display(){
        System.out.println("Hai from Display method from B");
    }
}
class A{
    static Integer num1 = 10; 
    Integer num2 = 20;
    static{
        System.out.println("Hai from Static block");
    }
    public A(){
        System.out.println("Hai from A Constructor");
    }
    public static void method1(){
        System.out.println("Hai from Method1 "+ num1);
        //System.out.println("Hai from Method1 "+ num2);
    }
    public void method2(){
        System.out.println("Hai from Method2 "+num1);
        System.out.println("Hai from Method2 "+num2);
    }
}
public class StaticClassExample {
    public static void main(String args[]){
        A.method1();
        System.out.println("Creating Object for A");
        A a = new A();
        a.method2();
        B.display();
        System.out.println();
    
    }
}
        