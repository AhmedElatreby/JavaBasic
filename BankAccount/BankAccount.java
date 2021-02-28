package BankAccount;

abstract class BankAccount 
{
    private String customerName;
    private String accountNumber;

    public void setName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getName()
    {
        return this.customerName;
    }

    public String getnumber()
    {
        return this.accountNumber;
    }

    void customer(){
        System.out.println("This is a customer name !" );
    }

    public abstract int interest();

    public abstract String customerName();
    

}
