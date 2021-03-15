package BasicCal;

import java.util.Scanner;

public class Calcaultor
{
   public static void main(String[] args) {
       Scanner cal = new Scanner(System.in);
       double num1, num2, answer;
       System.out.println("Please enter your first number: ");
       num1 = cal.nextDouble();
       System.out.println("Please enter your secound number: ");
       num2 = cal.nextDouble();
       answer = num1 + num2;
       System.out.println("The answer is: " + answer);
   } 
}
