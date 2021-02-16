package Construction;

public class Main 
{
    public static void main(String[] args) 
    {
        // to use the shirt class we have to call it in the main class
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

        // to print the outcome we use the println and call the method inside the println
        System.out.println(s.color);
        System.out.println(s.size);
        
    }    
}
