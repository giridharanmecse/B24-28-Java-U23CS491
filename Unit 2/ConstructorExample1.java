class A{
    A(){
        System.out.println("Hai from Default A");
    }
    public A(int num1){
        System.out.println("Value from A"+num1);
    }
    public void display(){
        System.out.println("Display from A");
    }

}
class B extends A{
    B(Integer num1){
        super(num1);
        System.out.println("Value in B "+num1);
        
    }
}

public class ConstructorExample1 {
    public static void main(String[] args) {
        B b1 = new B(10);
        b1.display();
    }
}
