package AccessModifiers.package2;

import AccessModifiers.package1.Access1;

// you can access the protaced class by extends the protacted class
public class Access3 extends Access1
{
    public static void main(String[] args) 
    {         
        Access1 a = new Access1();

        // to access the protacted protacted class access1 we have to use through access3 class not access1 class
        Access3 b = new Access3();

        // But we cannot access the input from Access1 class as it is a default modaifier not public
        System.out.println(a.hours); 
        System.out.println(a.minutes); 

        // we can access the input from Access1 class as it is a public modaifier
        System.out.println(a.hoursToday);
        System.out.println(a.minutesToday);

        // we cannot access the input from Access1 class as it is a private modaifier
        System.out.println(a.hoursYesterday);

        // we cannot access the input from Access1 class as it is a proatacted modaifier
        System.out.println(a.hoursTomorrow);

        // we can access the input from Access1 class when we extend from the protect class
        System.out.println(b.hoursTomorrow);
    }    
}
