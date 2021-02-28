package BankAccount;

public class CheckingAccount extends BankAccount
{     
    
    public void checkingAccount() {}

	@Override
    public int interest() {
        System.out.println("This is checking account");
        return 0;

    }

    @Override
    public String customerName() {
        System.out.println("this the name of the customer in the checking account!");
        return null;
    }
   
}
