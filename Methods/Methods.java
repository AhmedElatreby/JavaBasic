package Methods;

import javax.swing.plaf.multi.MultiTableHeaderUI;

public class Methods 
{
    public static void main(String[] args) {

        // a methods if a few lines of code that can be called over and over to save repeting the code
        // for exaple, we can use this three lines, but we have to added this everytime we want to use it
        int a = 5;
        int b = 10;
        System.out.println(a * b);

        //  intead we call the multiply method

        welcome();
        multipy(5, 10);        
        multipy(6, 10);        
        multipy(7, 10);
        divide(20, 5);        
        divide(30, 5);        
        divide(100, 5);        
       
    }
    // the altrentive is to create a method 
        // to create a method you do as follow

    public static void multipy(int a, int b) {
        System.out.println(a * b);
    }   

    public static void divide(int a, int b)
    {
        System.out.println(a / b);
    }

    public static void welcome()
    {
        System.out.println("Welcom to our calculator!");
    }
    
    
}
