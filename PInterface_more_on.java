//class - class --> extends we can use
//class - interface --> implements 
//interface - interface --> extends

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

}

//Apart from AA we created DD as second reference
interface DD
{
    void test();
}



interface EE extends DD
{
    //void test(); will be inheritance here as we extends
}



//One concrete class implements multiple interfaces like AA,EE
//But we need to declear as public
class BB implements AA,EE
{
    public void show()
    {
        System.out.println("in to Show..");
    }
    public void config()
    {
        System.out.println("in to Config..");
    }
    public void test()
    {
        System.out.println("in to test..");
    }
    
} 


public class PInterface_more_on 
{
    public static void main(String a[])
    {
        AA obj; //Defined the type of AA
        obj = new BB(); //Can't create the object of AA as it's interface
        obj.show();
        obj.config();

        //We need to create reference of DD and declear the variable into that, check line 24 
        DD obj1;
        obj1 = new BB();
        obj1.test();
        


    }
}

