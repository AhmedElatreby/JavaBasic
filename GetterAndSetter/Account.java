package GetterAndSetter;

public class Account
{
    // creating account object
    String name;
    int age;
    public static void main(String[] args) 
    {
        Account a = new Account();   

        a.setName("Ahmed");
        a.setAge(39);

        System.out.println(a.getName());
        System.out.println(a.getAge());

        a.print();
    }

    // create a setter method for name
    public void setName(String name)
    {
        this.name = name;
    }

    // create a setter method for age
    public void setAge(int age)
    {
        this.age = age;
    }

     // create a getter method for name
     public String getName()
     {
            return this.name;
     } 

     // create a getter method for age
     public Integer getAge()
     {
            return this.age;
     } 

    public void print()
    {
        System.out.println(getName() + ", " + getAge());
    }
}
