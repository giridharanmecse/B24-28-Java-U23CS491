public abstract class Shape {
    private String color;
    private int borderWidth;

    public void setColor(String color){
        this.color = color;
    }
    public void setBorderWidth(int borderWidth){
        this.borderWidth = borderWidth;
    }
    public String getColor(){
        return this.color;
    }
    public int getBorderWidth(){
        return this.borderWidth;
    }
    public abstract int area();
    
}
