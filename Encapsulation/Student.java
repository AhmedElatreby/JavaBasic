package Encapsulation;

public class Student 
{    
    // this is not good practice, as it should be private as the user should not have access to it if you using this method in a banck account for an example
    String name;
    int age;

    // create a setter method call setName. Is void as is not returning anything. Than passing the new name inside the method
    public void setName(String newName)
    {
        this.name = newName;
    }

    // creating a private example
    private String name1;
    private int age1;

    // create a setter method call setName1. Is void as is not returning anything. Than passing the new name inside the method
    public void setName1(String newName1)
    {
        this.name1 = newName1;
    }

    public void setAge1(int newAge1)
    {
        this.age1 = newAge1;
    }

    // than we have to create a getter method to be able to access the private method from the main class
    public String getName1()
    {
        return name1;
    }

    public int getAge1()
    {
        return age1;
    }

      

}
