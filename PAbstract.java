//No mandatory that abstract class should have abstract method
//Normal method can be also contains in abstract class
abstract class Car
{
    // public void Drive()
    // {

    // }
    //Lets say I don't know how to define this Drive method
    //Need someone or other class to define this method
    //For that need to declare this Drive class below with abstract keyword
    //abstract keyword will work under abstract class 
    public abstract void Drive();
    //What if I have multiple abstract method in parent class, then
    //1.class BMWCompany will not work untill we adding abstract with class
    //2.If we add abstract with class BMWCompany, then obj = new BMWCompany will not work
    public abstract void Fly();
    //So we need to add another class which extends BMWCompany

    public void PlayMusic()
    {
        System.out.println("Bollywood Music");
    }
}

/***As in Parent abstract class having two abstract methods,
>>Condition: 1, Hence either we have to create a class with similar implementation e.g.
Drive() and Fly() both method orienteted class (in this case no abstract class required to inherite,
Concrete class is enough). 
>>Condition: 2, Or if you are going with one method Drive() then you need to implement one abstract class
to inherite and concrete class after that.
*/
abstract class BMWCompany extends Car
{
    //Mandatory! Need to override the method in abstract class
    //Need to give Drive() only as this class defined with abstract
    public void Drive()
    {
        System.out.println("Driving...");
    }

}

//Concrete class
class UpdateBMWCompany extends BMWCompany
{
    
    public void Fly()
    {
        System.out.println("Flying...");
    }

}

public class PAbstract
{
    public static void main(String args[])
    {
        // Car obj = new Car();
        //You can't create an object of a abstract class i.e. Car()
        //So the alternate is dynamic object assign as below
        // Car obj = new BMWCompany();
        //As we converted BMWCompany as abstract class, so it will be not usable 
        Car obj = new UpdateBMWCompany();

        obj.Drive();
        obj.PlayMusic();
        obj.Fly();
    }    
}
//So every time we are declearing method in parent class, we are creating one extra class with previous class extends
//Only last subclass/concrete class will be without abstract and able to call upper classes
//So we can make object of concrete class not for abstract class