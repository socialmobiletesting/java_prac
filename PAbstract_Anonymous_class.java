abstract class A{
    public abstract void show();

    public void chow(){
        System.out.println("inside abstract class");
    }
}


//with anonymous class we can intantiate abstract class, 
//Without creating two extra classes
public class PAbstract_Anonymous_class{
    public static void main(String args[])
    {
        //With the help of anonymous inner class directly we can create, 
        //abstract class object
        A obj = new A() {
            //With anonymous inner class method we can intantiate abstract method 
            public void show(){
                System.out.println("inside abstract anonymous class");
            }
        };
        obj.show();
        obj.chow();
    }
}