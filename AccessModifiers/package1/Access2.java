package AccessModifiers.package1;

// you can access the protaced class by extends the protacted class
public class Access2 
{
    public static void main(String[] args) 
    {
        Access1 a = new Access1();

        // we can access the input from Access1 class as it is a default modaifier        
        System.out.println(a.hours); // outcomell be 5
        System.out.println(a.minutes); // outcomell be 45

        // we can access the input from Access1 class as it is a public modaifier
        System.out.println(a.hoursToday);
        System.out.println(a.minutesToday);

        // we cannot access the input from Access1 class as it is a private modaifier
       // System.out.println(a.hoursYesterday);

        // we can access the input from Access1 class as it is a protacted modaifier
        System.out.println(a.hoursTomorrow);
        System.out.println(a.minutesTomorrow);
    
    }    
}
