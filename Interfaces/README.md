Interface
Overview: is an outline for a class. Moreover, interface define the behaviour of the object.
A class can extend another class, but class cannot extend an interface, it instead it implements an interface.
For example:
Cat can (walk, talk and eat) this will be the same with all other animals therefor we can use this as interface to prevent the repeating of code and following do not repeat yourself (DRY)  
How to use it:
You need to implement the interface in the class in order to be able to use it

You need to input the interface into the class and input the methods that you going to use it in the other classes.
public interface IWaterBottle 
{
    String color = "Blue";

    void fillUp();
    void pourOut();
}


To call the interface that you used in the interface you will need to implement into the class for example. 
public class InterfaceExample implements IWaterBottle

than you call the methods that was created in the interfaced class that was created
public class InterfaceExample implements IWaterBottle
{
    public static void main(String[] args) 
    {
        System.out.println(color);
        // we have to create an new varabile to access the interface in this class
         IWaterBottle wb = new InterfaceExample();
         // once the new varaible created we can acced all the mothed that was created in the interface class
         wb.fillUp();
         wb.pourOut();
    }
    
    public void fillUp() 
    {        
        System.out.println("We fill up the water bottle");
    }
   
    public void pourOut() 
    {        
        System.out.println("We pour out the water bottle");
    }
}
    }

