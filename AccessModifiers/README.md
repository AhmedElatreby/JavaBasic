Java Access Modifiers
Access modifier let us give access to other files about the data
There are four types of Java access modifiers and they are:
•	Default: this when we do not declare the access modifier is going to be accessed to the other classes in the same package for example 
NameOfClass a = new NameOfClass();
System.out.println(a.contentOfTheClass);

•	Public: works similar to the default modifier, but you have to put public in front of the data type such as public int hours = 3;
In public modifier you access between the class in the same package of different packages.
•	Private: you will be able to access the class’s content from the other classes, as the data will be private.
•	Protected: it will allow access to the class content in the same package or folder, but it will not allow you to access the data from different folder of package. However, if the other class from different package have extends access to the class, than the data can be accessed. 

Summary:
 1. private: accessible in the same file 
2. default: accessible in the same package 
3. protected: accessible in the same package; accessible in all packages w/ "extend" E.g., other package extend package1{ 
4. public: accessible in all packages
All the above access modifier works the same with java mothed 

