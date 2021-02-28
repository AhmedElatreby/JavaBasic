package Class;

public class Main 
{
    public static void main(String[] args) 
    {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();

        c1.printHi();
        
        System.out.println("This is input from class1 " + c1.x);    
        System.out.println("This is input from class2 " + c2.y);    
    }
}
