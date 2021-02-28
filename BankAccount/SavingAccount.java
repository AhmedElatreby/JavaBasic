package BankAccount;

public class SavingAccount extends BankAccount
{
    @Override
    public int interest() {
        System.out.println("This is the saving account");
        return 0;

    }

    @Override
    public String customerName() {
        System.out.println("THis is the custmer name in the saving account");
        return null;
    }
}
