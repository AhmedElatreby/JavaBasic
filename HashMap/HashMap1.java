package HashMap;

// import Hash Map class in order to use this function
import java.util.HashMap;

public class HashMap1 
{
    public static void main(String[] args) 
    {  
        // create a new variable  and called map
        // you identfay the Key and the value (Key = String) (Value = Integer)
        HashMap<String, Integer> map = new HashMap<>();
        
        // to store the value, we call the variable  that was created, followed by(.) than (put) and finally (key, value)
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 55);
        
        // to print we just put the name of the variable that was created 
        System.out.println(map);
        
        // you can get the value for an input by calling the String
        System.out.println(map.get("c"));


        // trying hash map with storing a user name and password 
        HashMap<String, String> test = new HashMap<>();
        test.put("username1", "password1");
        test.put("username2", "password2");
        test.put("username3", "password3");
        test.put("username4", "password4");
        test.put("username5", "password5");
        test.put("username6", "password6");

        // you can remove form the list by using .remove
        test.remove("username1");

        // you can check if hashmap contains value 
        System.out.println(test.containsValue("password2")); //  the outcome will be (true)

        // you can check if hashmap contains key 
        System.out.println(test.containsKey("username3")); //  the outcome will be (true)

        // you can get the size of the list
        System.out.println(test.size()); // the outcome will be 5

        // you can replace the value by the key, old value and the new value
        System.out.println(test.replace("username5", "password5", "password100"));

        // you can get all the values
        System.out.println(test.values());
        
        // you can get all the key
        System.out.println(test.keySet());

        System.out.println(test);
        
    }    
}
