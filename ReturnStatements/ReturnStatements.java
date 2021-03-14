package ReturnStatements;

public class ReturnStatements 
{
    public static void main(String[] args) {
        //to call the methods you print the name of the method followed by ();
        printMessage();

        System.out.println("__________using a method holding input_____________");
        // calling method add and input int a and int b
        add(10, 30);
        System.out.println("_________using a methods with return___________");
        add1(20, 20);
        System.out.println("___________using a method return string____________");
        // using a return statment with String
        String z = caps("This is a string to convert to caps!");
        System.out.println(z);
        System.out.println("__________using a methods return array___________");

        // using a return statments with an array
        int[] thisIsArray = array1(100, 300, 600);
        System.out.println("This is the first array " + thisIsArray[0]);
        System.out.println("This is the second array " + thisIsArray[1]);
        System.out.println("This is the third array " + thisIsArray[2]);

        System.out.println("__________using a methods returing a value being stored________");
        // storing the value into a varible
        int sum = add1(30, 30);
        // print sum to test the value
        System.out.println("The value of sum is: " + sum);
        System.out.println("____________________________");
    }   
    
    // to create a method we fellow the example below
    public static void printMessage()
    {
        System.out.println("This is a method");
    }

    // creating a method holing input
    public static void add(int a, int b)
    {
        System.out.println(a + b);
    }

    // return statements return stements let you run a method and bring the 
    //results of that method into alaceted variable

    // to use a return statements you have to use the type of data and add return inside the method
    public static int add1(int a, int b){
    return a + b;
    }

    // another example using return statements with String
    public static String caps(String s)
    {
        return s.toUpperCase();
    }

    // using a return statments with an array
    public static int[] array1(int a, int b, int c)
    {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }
}
