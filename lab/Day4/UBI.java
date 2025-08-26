public class UBI extends Bank{
    Account acc;
    Integer serviceCharge = 15;

    public UBI(Account acc){
        super("UBI");
        this.acc = acc;
    }
    @Override
    public void deposit(Integer amount) {
        acc.setAccBalance(acc.getAccBalance()+amount-serviceCharge);
    }
    @Override
    public boolean withdraw(Integer amount) {
        if(acc.getAccBalance()>=(amount+serviceCharge)){
            System.out.println("amount withdraw : "+amount);
            acc.setAccBalance(acc.getAccBalance()-amount-serviceCharge)
            System.out.println("balance "+acc.getAccBalance());
            return true;
        } else{
            System.out.println("insufficient balance");
            return false;
        }
        
    }
}
