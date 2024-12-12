
enum Laptop
{
    /***
     * Enums: Enums are a special type in Java that define a set of named constants. 
     * In your code, Macbook, ThinkPad, and DellInspiron are enum constants representing different laptop models.
     */
    //Each of these objects are constructor where we are passing a value
    Macbook(2000), ThinkPad(1500), DellInspiron(2500);

    private int price;


    //Defined the price value below by generating an constructor
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    
}

public class PEnum_Class {
    
    public static void main(String a[])
    {
        Laptop lap = Laptop.ThinkPad;
        System.out.println(lap);
    
        System.out.println(lap + ":" + lap.getPrice());
    }
    
}


