public class Main {
    public static void main(String [] args){
        Car c1 = new Car();
        Car c2 = new Car();
        c1.setNoOfTyres(4);
        c1.setColors("Blue");
        c2.setNoOfTyres(5);
        c2.setColors("White");
        System.out.println("Car1");
        System.out.println("Tyres :"+c1.getNoOfTyres());
        System.out.println("Color :"+c1.getColors());
        System.out.println("Car 2");
        System.out.println("Tyre :"+c2.getNoOfTyres());
        System.out.println("Color : "+c2.getColors());

        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setName("AAAA");
        Student s2 = new Student();
        s2.setRollNo(2);
        s2.setName("BBBBB");
        System.out.println("Student 1 : "+s1.getName()+" "+s1.getRollNo());
        System.out.println("Student 2 : "+s2.getName()+" "+s2.getRollNo());
    }
    
}
