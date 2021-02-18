Static 
The definition of static on w3school is:
Static keyword is a non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class.

	A static method can be accessed without creating an object of the class first.

You can access the globule variables by using static word. 

For example:

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
        // we can not access (a) as is not in static 
        System.out.println(a + b);
        // we will be able to access (c) as it is static 
        System.out.println(c + b);

    }    
}



