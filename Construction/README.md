Construction
In a very simple way, constructor basically makes an object.
Object in real life has certain properties and can-do certain things. In Java we represent objects as having certain properties and can-do certain things. 
For an example:
A shirt is an object, and the properties is have size and colour
An example for Shirt class

public class Shirt 
{
    // this is the properties of the shirt
    public static String color; 
    public static char size;

    // you can create a default constractor as follow
    Shirt() {}
    
    
    // this is the methods for the shirt
    // for an example you can put shirt on or take it off
    public static void putOn()
    {
        System.out.println("Shirt is on!");
    }

    public static void takeOff() 
    {
        System.out.println("Shirt is off! ");    
    }

    // you can create a constructor inside the shirt class. 
    // for an example
    public static void setColor(String newColor)
    {
        color = newColor;
    }

    public static void setsize(char newSize)
    {
        size = newSize;
    }

}


An example for the Main class

public class Main 
{
    public static void main(String[] args) 
    {
        // to use the shirt class, we have to call it in the main class
        // we call the shirt class, create an object and we called (s)
        Shirt s = new Shirt();

        // once the shirt object is created in the main class than we can call it by (.)than the name
        // of the method that was created in the shirt class
        s.putOn();  
        s.takeOff();
        System.out.println(); 

        // Now we can call the objects that was created in the shirt class be (.) than the name of constructor
        s.setColor("Red");
        s.setsize('M');

        // to print the outcome, we use the println and call the method inside the println
        System.out.println(s.color);
        System.out.println(s.size);
        
    }    
}



