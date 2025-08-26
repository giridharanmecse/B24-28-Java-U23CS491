public abstract class  Bank{
    private String name;
    
    public Bank(String name) {
        this.name = name;
    }

    public abstract void deposit(Integer amount);
    public abstract boolean withdraw(Integer amount);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}