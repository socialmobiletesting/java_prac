class M
{
    public void View1()
    {
        System.out.println("in M View1");
    }
}

class N extends M
{
    public void View2()
    {
        System.out.println("in M View2");
    }
}


public class PUpcasting_Downcasting
{
    public static void main(String args[])
    {
        // M obj = new N();
        M obj = (M) new N(); 
        //This is already an default backend method of M obj = new N();
        //Whatever object you are sending in child class N, type casting it to parent class M
        //By type casting we are going child to parent means towards up, so it's called Upcasting
        obj.View1();
        
        //Below we are downcasting the obj to obj1 which means
        //Downcasting Parent class reference(obj) to Child class reference(obj1)
        N obj1 = (N) obj;
        //Here we are assigning whatever obj1 type which is N, change into similer type to obj(from type M to type N)
        //By doing this we are going parent to child means towards down, so it's called Downcasting 
        obj1.View2();
        
    
    }
        
}


// public class PUpcasting_Downcasting
// {
//     public static void main(String args[])
//     {
//         double var = 4.5;
//         int i = (int)var;    
        
//         System.out.println(i);
    
//     }
        
// }
