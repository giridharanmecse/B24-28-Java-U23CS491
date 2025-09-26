public class ClassMain {
    public static void main(String args[]){
        InterfaceB a = new ClassA();
        a.method1();
        a.method2();
        a = new ClassB();
        a.method1();
        a.method2();
    }
}
