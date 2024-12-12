class Comp
{
    public void code()
    {
        
    }
}

// abstract class Comp
// {
//     public abstract void code()
//     {
//         void code();
//     }
// }


//We can use interface keyword directly here and
//Later in classes we need to use implements keyword instead of extends
interface Comp
{
    void code();

}


// class MacBook implements Comp
class MacBook extends Comp
{
    public void code()
    {
        System.out.println("Coding, Compile, Release");
    }

}

// class MacDesk implements Comp
class MacDesk extends Comp
{
    public void code()
    {
        System.out.println("Coding, Compile, Release : Faster");
    }

}

class Developer
{
    // public void DevApp()
    // public void DevApp(MacDesk desk) //Need to pass exact required object along with parent class
    public void DevApp(Comp lap)
    {
        // System.out.println("Coding...");
        lap.code();

    }
}

public class PInterface_need 
{
    public static void main(String a[])
    {
        Comp lap = new MacBook();
        Comp desk = new MacDesk();
        // MacDesk obj = new MacDesk();
        // MacBook obj = new MacBook();
        
        Developer Raju = new Developer();
        // Raju.DevApp();
        Raju.DevApp(desk);
    }    
}

//To solve duplicate of code() method we introduce parent class of Comp()
//Later we are extanding Parent class to subclass MacBook & MacDesk
//All we have to do is, passing the actual object in DevApp method (which will be later associated with main class) & Parent class Comp()

//And we can create new objects with combination of Parent & Sub-class 
