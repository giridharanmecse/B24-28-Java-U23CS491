public class Circle extends Shape{
    private int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    @Override
    public int area(){
        return (int)(3.14*radius*radius);
    }
    
}
