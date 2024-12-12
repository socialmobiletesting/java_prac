// Every constructor by default have a method called "Super()""
// Super() means call the constructor of a super class, by default every class having Super()
class X extends Object //Every class have a default extends Object class untill we are mentioning it
{
    public X()
    {
        System.out.println("in A");
    }
    // By calling "B obj = new B(5);" from main class compiler will not enter below constructor as upper one is default one, after this compiler will go class B parameterized constructor"
    public Y(int a)
    {
        System.out.println("in A int a");
    }
}



class Z extends X
{
    public Z()
    {
        // super(5); // We are passing this value to enter class A parameterized constructor, this is called multi=level inheritance
        super();
        System.out.println("in B");
    }
    //Without passing any int value from main class, by running this code it will not enter below parameterized constructor. Will be stays above default constructor
    public Z(int n)
    {
        this(); // This() will call the all constructor of same class & the default one of extend class A 
        System.out.println("in B int n");
    }
}


public class PSuper_this {
    public static void main(String args[])
    {
        // B obj = new B();
        Z obj = new Z(5); // Calling the parameterized constructor
        
        
        // System.out.println(x);
    }
}
