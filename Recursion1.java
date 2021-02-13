// using recursion is when calling the method inside itself
// you have to use if statmend and give a value inside the method to be able to work
public class Recursion1
{
    public static void main(String[] args) 
    {
        countBackwords(15); 
    }

        public static void countBackwords(int n) // giving a value to be able to use in the recursion
        {
            if(n == 0){ // you need if statment to use recursion
            System.out.println("Done!");
            }else{
                System.out.println(n);
                n--; // you will need this to make the recursion to work
                countBackwords(n); // 
            }
        }
    
}