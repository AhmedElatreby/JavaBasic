package Inherit;

public class Main 
{
    public static void main(String[] args) {
        Mouse3 m3 = new Mouse3();

        m3.ambidextrous();

       System.out.println(m3.ambidextrous); 

       Mouse1 m1 = new Mouse1();
       m1.leftClick();
       m1.rightClick();
       m1.scrollUp();
       m1.scrollDown();
        
    }
    
    
    
}
