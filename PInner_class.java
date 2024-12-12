class U
{
    //Defining variable
    int Price;

    //Defining method
    public void Chaw()
    {
        System.out.println("in Chaw");
    }

    //Defining class
    class H
    {
        public void Abcd()
        {
            System.out.println("in Abcd");
        }
    }

    // static class H
    // {
    //     public void Abcd()
    //     {
    //         System.out.println("in Abcd");
    //     }
    // }
}

public class PInner_class
{
    public static void main(String args[])
    {
        U obj = new U();
        obj.Chaw();
        
        //Need to assign object of H class along with obj
        //With help of obj of obj we can access inner class method
        //But make sure that object is not a inner class
        U.H obj1 = obj.new H();
        obj1.Abcd();

        //We can call inner class without help of other object if that class is defined with static
        // U.H obj2 = new U.H();
        // obj2.Abcd();
    }

}
