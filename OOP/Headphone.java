package OOP;

public class Headphone
{
    String charge =  "Micro usb";
    String[] controls = {"Power", "volume", "skip", "play"};
    String color = "Red";

    static boolean power = false;
    static int volume = 0;

    public static void powerOn()
    {
        power = true;
    }

    public static void powerOff()
    {
        power = false;
    }

    public static void volumeUp() 
    {
          volume++;  
    }

    public static void volumeDown() 
    {
          volume--;  
    }
}
