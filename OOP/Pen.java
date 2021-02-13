package OOP;

public class Pen 
{
    String type = "gel";
    String color = "red";
    int point = 10;
    
    static boolean clicked = false;

    public static void click()
    {
        clicked = true;
    }

    public static void unclick()
    {
        clicked = false;
    }
}
