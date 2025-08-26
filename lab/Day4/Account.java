public class Account {
    private String name;
    private Integer accNumber;
    private Integer accBalance;    

    public Account(String name, Integer accNumber) {
        this.name = name;
        this.accNumber = accNumber;
        this.accBalance  = 0;
    }
    
    public Account(String name, Integer accNumber, Integer accBalance) {
        this.name = name;
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }
    public Integer getAccBalance() {
        return accBalance;
    }
    public void setAccBalance(Integer accBalance) {
        this.accBalance = accBalance;
    }

    
}
