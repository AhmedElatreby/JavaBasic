package BankAccount;

public class Main 
{
    public static void main(String[] args) 
    {
        CheckingAccount ca = new CheckingAccount();
        SavingAccount sa = new SavingAccount();

       

        ca.customer();
        sa.interest(); 
        sa.customerName();
        ca.customerName();  
        ca.setName("Ahmed"); 
        ca.setNumber("123456");        

        System.out.println(ca.getName());
        System.out.println(ca.getnumber());

    }

    private static void checkingAccount() {
        //String bankAccount;
		System.out.println(sa.customerName);
        ca.
    }
}
