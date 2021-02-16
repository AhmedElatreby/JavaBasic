package Enum;

public class EnumInsideClass 
{
    // create enum inside the class
    enum Flavor
    {
        CHOCOLATE,
        VANILLA,
        STRAWERRY
    }
    public static void main(String[] args) 
    {
        // create a value for the flavor and called flav 
        Flavor flav = Flavor.CHOCOLATE;

        // use if statment 
        if (flav == Flavor.CHOCOLATE) {
            System.out.println("It's Chocolate! ");            
        } else if (flav == Flavor.VANILLA) {
            System.out.println("It's Vanilla! ");            
        } else if (flav == Flavor.STRAWERRY) {
            System.out.println("It's Strawerry! ");  
            
        }        
    }
}
