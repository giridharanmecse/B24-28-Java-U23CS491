public class Main {
    public static void main(String[] args) {
        First f1 = new First();
        First f2 = new First();
        System.out.println("F1 State "+f1.getState());
        System.out.println("F2 State "+f2.getState());
        f1.setName("F1");
        f2.setName("F2");
        f1.start();
        System.out.println("F1 State "+f1.getState());
        System.out.println("F2 State "+f2.getState());
        f2.start();
        System.out.println("F1 State "+f1.getState());
        System.out.println("F2 State "+f2.getState());
        
    }
    
}
