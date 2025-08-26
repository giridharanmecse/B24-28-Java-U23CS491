public class ICICI extends Bank {

    Account acc;
    Integer serviceCharge = 5;

    public ICICI(Account acc){
        super("ICICI");
        this.acc = acc;
    }
    @Override
    public void deposit(Integer amount) {
        Integer newBalance = acc.getAccBalance()+amount-serviceCharge;
        acc.setAccBalance(newBalance);
    }
    @Override
    public boolean withdraw(Integer amount) {
        if(acc.getAccBalance()>=(amount+serviceCharge)){
            //System.out.println("amount withdraw : "+amount);
            acc.setAccBalance(acc.getAccBalance()-amount-serviceCharge)
            //System.out.println("balance "+acc.getAccBalance());
            return true;
        } else{
            //System.out.println("insufficient balance");
            return false;
        }
        
    }
}
