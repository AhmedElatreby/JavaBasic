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
