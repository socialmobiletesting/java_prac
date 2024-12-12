// abstract class AA
// {
//     public abstract void show();
//     public abstract void config();
// }

//interface is a class where all the method by default public abstract
interface AA
{
    //By default in interface every method is a public abstract, hence public abstract keyword not require
    void show();
    void config();
    void test(int i);
    //We can declear variable under interface which will be final & static because
    //You can't intantiate interface, for that you need to create concrete class
    int age = 44;
    String area = "Kolkata";

}



//Created a concreate class where methods of interface AA has been defined
class BB implements AA
{
    public void show()
    {
        System.out.println("in to Show..");
    }
    public void config()
    {
        System.out.println("in to Config..");
    }
    public void test(int i)
    {
        System.out.println("in to test.."+ i);
    }
    
} 


public class PWhat_is_interface 
{
    public static void main(String a[])
    {
        AA obj; //Defined the type of AA
        obj = new BB(); //Can't create the object of AA as it's interface
        obj.show();
        obj.config();
        obj.test(5);

        System.out.println(AA.age); //We can call static variable any time


    }
}
