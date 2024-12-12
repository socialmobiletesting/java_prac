class Scooty
{
    String model;
    int price;

    //We can create to String method & hashcode method from Right click>Source Action>
    //object default behaviour will call method of a superclass 
    public String toString()
    {
        // return "Hey";
        return model + ":" + price;
    }

    //Creating an class with boolean comparison of String & int
    //In java only String comparison is given not int, so we created an class
    public boolean equals(Scooty that)
    {
        //model comparison taken from equals class & price comparison from int==int logic
        if(this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
    }
    
}

public class PObj_Class_String_Hashcode
{
    public static void main(String args[])
    {
        Scooty obj = new Scooty();
        obj.model = "Activa";
        obj.price = 1000;

        System.out.println(obj); //Everytime you call obj, it will call toString() method
        // System.out.println(obj.toString());
        //Hashcode, if you have multiple objects then it will generate a string with hexadecimal for a perticuler bytes value

        Scooty obj1 = new Scooty();
        obj1.model = "Activa";
        obj1.price = 10001;

        Scooty obj2 = new Scooty();
        obj2.model = "Activa";
        obj2.price = 1000;


        //Below comparison is wrong as its only based on String
        boolean result = obj1.equals(obj2);
        System.out.println(result);

    }
}
