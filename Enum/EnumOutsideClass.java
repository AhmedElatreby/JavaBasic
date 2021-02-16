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
