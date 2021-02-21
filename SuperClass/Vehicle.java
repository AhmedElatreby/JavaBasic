package SuperClass;

 class Vehicle 
{
    public void vRoom()
    {
        System.out.println("vRoom!! ");
    }
    int maxSpeed = 120;
}

class Car extends Vehicle
{
    int maxSpeed = 100;

    public void display()
    {
        System.out.println(maxSpeed);
    }

    public void vRoom()
    {
       // System.out.println("SKUURT");
        super.vRoom();
    }
}
