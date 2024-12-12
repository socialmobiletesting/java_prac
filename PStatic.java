class Mobile{
    String brand;
    static int price; // By adding static this price will be reflect in all variables in main class
    String type;

    // static not mentioned means below method is an instance method
    public void loc(){
        System.out.println(brand + ":" + price + ":" + type);
    }
    
    // public static void loc1()
    //brand & type value compiler will confused because these two are instance variables, means it's having diff diff values
    //To avoid this issue we need to call Mobile.loc1(obj) in main class
    //Need to accept from Mobile class by giving value (Mobile obj)

    public static void loc1(Mobile obj)
    {
        System.out.println(brand + ":" + price + ":" + type);
    }
    
}

public class PStatic {
    public static void main(String args[])
    {
        Mobile obj1= new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.type = "MacOS";

        Mobile obj2= new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        obj2.type = "SmartPhone";
        // obj2.price = 2000; //price 2000 will be reflect in all variable price
        Mobile.price = 2000; //If you want to access any static varible, you can access via class name

        obj1.loc();
        obj2.loc();

        Mobile.loc1(obj1);
        // Mobile.loc(); // This is wrong as you can't call a class with non-static variable into it loc()

        // System.out.println(obj2.type);
    }
}
