Encapsulation
Is kind of sound like in capsule. For example, if you think like a pill everything is inside the pill.
But encapsulation in java, is all the variables of class is inside a method  
For an example
package Encapsulation;

public class Main 
{
    public static void main(String[] args) 
    {
        // to get the input from the class student we need to create a new variable
        Student s = new Student();

        // to set input to the student class we can use the method below, but this is not a good practice
        // However, the best practice is to use getter and setter in the student class
        s.name = "Ahmed";
        s.age = 39;

        // to get the result you use (.) followed by the variables
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println("-----------------------------------------------");

        System.out.println("Using the setter and getter method");

        // using the setter method
        Student s1 = new Student();

        s1.setName1("Ahmed 1");
        s1.setAge1(39);

        // If we try to access the String name1, we wont be able to access, as it's private
        // System.out.println(s1.name1);

        // calling out the getter method
        System.out.println(s1.getName1());
        System.out.println(s1.getAge1());
         

        

    }    
}



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


