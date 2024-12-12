class SmartMobile{
    String brand;
    int price; 
    static String type; // By adding static this price will be reflect in all variables in main class

    static{
        type = "SmartPhone";
        System.out.println("In static block");
        
    }

    // Creating an constructor, where brand & price can be call every time it is ok with new variable but why
    // type should call everytime? It's a static varible so will not accept new value from ranom objects
    public SmartMobile(){
        brand = "";
        price = 2000;
        // type = "Phone"; //initiating a static variable into a constructor
        System.out.println("In constructor");
    }
    
    
}

public class PStatic_Block {
    public static void main(String args[])
    {
        // Class.forName("SmartMobile"); // To call a static class
        SmartMobile obj1= new SmartMobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.type = "SmartPhone";

        SmartMobile obj12= new SmartMobile();

    }
}

// When we create class & instances, class will load in class loader inside JVM. Then objects will be defined.
// If static instances or method or sub-class will be define then that will be called first, that's why static vaiable
// "type" has been called for once, not twice. So without object if I want to see static variable then
// There is a class.class is defined, please check above.