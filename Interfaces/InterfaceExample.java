package Interfaces;

public class InterfaceExample implements IWaterBottle
{
    public static void main(String[] args) 
    {
        System.out.println(color);
        // we have to create an new varabile to access the interface in this class
         IWaterBottle wb = new InterfaceExample();
         // once the new varaible created we can acced all the mothed that was created in the interface class
         wb.fillUp();
         wb.pourOut();
    }

    @Override
    public void fillUp() {
        System.out.println("We fill up the water bottle");

    }

    @Override
    public void pourOut() {
        System.out.println("We pour out the water bottle");

    }    
   
}
