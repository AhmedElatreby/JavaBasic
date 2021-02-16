package Construction;

public class Shirt 
{
    // this is the properties of the shirt
    public static String color; 
    public static char size;

    // you can create a default constractor as follow
    Shirt() {}

    
    
    // this is th methods for the shirt
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
