Using inheriting in java will preventing redundancy in your code
For example:
We going to create a gaming mouse, rather duplicating the same code over and over in each class. We can create a blue print for the design of the mouse where it will have the same features such as:
All mouses have right and left click. This can be created in the mouse class.
All the other features that different in the other mouses will be created in different class 

In order to inherit from the mouse class we use the following syntax 
public class Mouse1 extends Mouse 

to call this features we need to create a Main class, such as:
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


