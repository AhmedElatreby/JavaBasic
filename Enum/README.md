Enum
Enum is short for "enumerations", which means "specifically listed".
Is list of value that not going to changed, but it’s set up like a class and you can access it as a class

Why and When to Use Enums?
Use enums when you have values that you know they aren’t going to change like (month, days, colours etc..) rather than use array of string we can use enum
Enums is alternative to use array. It’s cleaner and easier to use than array   

How to use Enum?
You can use Enum inside a class or outside a class.
Enum do not have types. It is a list of labels.
By convention is to always to be used in uppercase 
Outside a class
package Enum;
// use enum outside a class
enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class EnumOutsideClass 
{
    public static void main(String[] args) 
    {
        // create a value for enum level and called l
        Level l = Level.LOW;
        // print the level low 
        System.out.println(l);
        
        // using a switch case with enum
        switch (l) {
            case LOW:
            System.out.println("This is the Low level! ");                
                break;        
            case MEDIUM:
            System.out.println("This is the Medium level! ");                
                break;        
            case HIGH:
            System.out.println("This is the High level! ");                
                break;        
        }
    }
}


To call enum from outside the class you use enum name followed by(.) than the labels such as Level.Low

Inside a class
package Enum;
// use enum outside a class
enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class EnumOutsideClass 
{
    public static void main(String[] args) 
    {
        // create a value for enum level and called l
        Level l = Level.LOW;
        // print the level low 
        System.out.println(l);
        
        // using a switch case with enum
        switch (l) {
            case LOW:
            System.out.println("This is the Low level! ");                
                break;        
            case MEDIUM:
            System.out.println("This is the Medium level! ");                
                break;        
            case HIGH:
            System.out.println("This is the High level! ");                
                break;        
        }
    }
}



Use Enum in Main class 
package Enum;

import Enum.EnumInsideClass.Flavor;

public class Main 
{
    public static void main(String[] args) 
    {
        // you can call Enum class into main mothed by the below syntax
        EnumInsideClass insideClass = new EnumInsideClass();
        System.out.println("this is a test " + " " + Flavor.STRAWERRY);

    }    
}




