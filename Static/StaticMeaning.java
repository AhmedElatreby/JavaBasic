package Static;

public class StaticMeaning 
{
    // creating a globule variable
    int a = 0;
    // creating a static varible
    static int c = 1;

    public static void main(String[] args) 
    {
        int b = 1;
        // // we can not access (a) as is not in static 
        // System.out.println(a + b);
        // we will be able to access (c) as it's static 
        System.out.println(c + b);

    }    
}
