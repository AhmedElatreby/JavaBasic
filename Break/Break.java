package Break;

public class Break 
{
    public static void main(String[] args) 
    {
        // using break with while loop
        int a = 0;

        while(a < 3){
        System.out.println("test"); 
        a++;
        // a break statment will stop the loop from running. It only allowed to run once   
        break;
        }

        // using break with a for loop
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                break;                
            }
         System.out.println(numbers[i]);        
        }

        // use break with switch case statment 
        int j = 55;

        switch(j){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One!");
                break;
            default:
                System.out.println("What's up!!");

        }

        // use a break with a neasted for loop
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.println(i + ", " + k);
                // but if we put a break, it only run for a on for loop not the secand one
                break;
            }
            
        }
    }     
}
