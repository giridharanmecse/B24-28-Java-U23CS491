public class SBI extends Bank {
    Account acc;
    Integer serviceCharge = 10;

    public SBI(Account acc){
        super("SBI");
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
