
public class Car extends Vehicle{
    boolean ac;
    String color;

    public Car(Integer noOfTyres, Integer noOfGears,boolean ac, String color) {
        super(noOfTyres,noOfGears);
        System.out.println("car Constructor is called");
        this.ac = ac;
        this.color = color;
    }

    public boolean getAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayCar(){
        System.out.println("AC Enabled :"+ac);
        System.out.println("Car Color :"+color);
    }

    public void carRunning(){
        System.out.println("My car is Running");
    }

    
    
}
