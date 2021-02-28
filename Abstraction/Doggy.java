package Abstraction;

// in order to use the animal class we have to use extends from animal 
// However, if you don't want to use the override methods, than you have to addedd abstract to the class for an example 
// public abstract class Doggy extends Animal 

public class Doggy extends Animal 
{

    // once you added the extend Animal class you have to add the methods from the animal class as well
    @Override
    void voice() {
        System.out.println("Dog sound is Bark!");        
    }

    @Override
    void NoOfLegs() {
        System.out.println("Dog has Four legs!");        
    }
    
}
