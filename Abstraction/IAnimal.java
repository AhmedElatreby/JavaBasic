package Abstraction;

// you have to use the keyword interface 
public interface IAnimal 
{   
    // you cannot use private variable in the interface class you only can use public, static and final
    public String name = "This is a dog";

    // to create a method within the interface class we don't need to use the keyword abstract
    // as it's be default created inside the method 
    void voice();

    // A method in interface class cannot have a body ({})
    void NoOfLegs();
}
