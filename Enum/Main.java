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
