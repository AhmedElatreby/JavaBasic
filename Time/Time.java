package Time;

import java.text.SimpleDateFormat;
//improting time and date class
import java.util.Date;

public class Time 
{
    public static void main(String[] args) {
        
        Date currentDate = new Date();
        System.out.println(currentDate);    
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));
    }    
}
