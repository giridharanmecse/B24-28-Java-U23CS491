
public class Vehicle {
    Integer noOfTyres;
    Integer noOfGears;
    
    public Vehicle(Integer noOfTyres, Integer noOfGears) {
        System.out.println("Vehicle Constructor is called");
        this.noOfTyres = noOfTyres;
        this.noOfGears = noOfGears;
    }

    public void start(){
        System.out.println("Vehicle Started");
    }

    public void stop(){
        System.out.println("Vehicle stop");
    }

    public void displayVehile(){
        System.out.println("No of Gears : "+noOfGears);
        System.out.println("No of Tyres : "+noOfTyres);
    }
    
}
