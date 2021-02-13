package OOP;

public class Main 
{
    public static void main(String[] args) 
    {
        Pen p = new Pen(); 
        System.out.println(p.color);    
        System.out.println(p.point);    
        System.out.println(p.clicked);   
        
        p.click();

        System.out.println(p.clicked);

        System.out.println("--------------------------------------------");

        Headphone h = new Headphone();

        System.out.println(h.charge);
        System.out.println(h.color);
        System.out.println(h.controls[2]);
        System.out.println(h.volume);

        h.powerOn();
        System.out.println(h.power);

        h.volumeUp();
        System.out.println(h.volume);
    }
    
    
}
