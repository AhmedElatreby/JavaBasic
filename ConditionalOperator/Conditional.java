package ConditionalOperator;

public class Conditional 
{
    public static void main(String[] args) {
        // conditional operator is a shorcut for if statment
        // the blow line is the same as a normal if statment 
        int a = (7 > 3 ) ? 7 : 3;
        // the altrentive will be 
        if (7 > 3) {
            a = 7;
        }else {
            a = 3;
        }// this is the same the top line
        System.out.println(a);

        // using conditional operator with String
        String b = "hi";
        double result = b.equals("World!") ? 0.5 : 0.9;
        System.out.println(result);

    }    
}
