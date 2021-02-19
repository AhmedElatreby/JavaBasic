Abstract
Is a class that usually contains at least one abstract method.

Different between abstract and interface 
In interface class we must use the keyword interface
public interface IAnimal 
{
    
}

In interface class we must use the keyword abstract 
public abstract class Animal 
{
    
}



you have to use the keyword abstract. 
public abstract class Animal 
{
you can creating a variable private string
    private String name;

to create a method we have to use the keyword abstract with the method
    abstract void voice();

you can create a method in the abstract class with a body
    void NoOfLegs()
    {
    }   
}



you have to use the keyword interface 
public interface IAnimal 
{   
 you cannot use private variable in the interface class you only can use public, static and final
    public String name = "This is a dog";
to create a method within the interface class we don't need to use the keyword abstract, as it's be default created inside the method 
    void voice();
A method in interface class cannot have a body ({})
    void NoOfLegs();
}


in order to use the animal class, we have to use extends from animal. 
However, if you don't want to use the override methods, then you have to addedd abstract tho the class for an example. 
public abstract class Doggy extends Animal 

public class Doggy extends Animal 
{
 once you added the extend Animal class you have to add the methods from the animal class as well
    @Override
    void voice() {    

    }
}

to use the IAnimal class we must use the keyword (implements)
However, if you don't want to use the override methods, than you have to addedd abstract tho the class for an example
public abstract class Cat implements IAnimal {
public class Cat implements IAnimal {

once you implement the IAnimal class you have to add the the methods from IAnimal class
    @Override
    public void voice() {       
    }
    @Override
    public void NoOfLegs() {       
    }    
}

