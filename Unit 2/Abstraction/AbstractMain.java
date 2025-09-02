public class AbstractMain {
    public static void main(String []args){
        Circle c1 = new Circle();
        c1.setRadius(2);
        c1.setColor("Red");
        c1.setBorderWidth(3);

        System.out.println("Circle : "+c1.area());
    }
    
}
