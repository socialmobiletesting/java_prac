// Every constructor by default have a method called "super()""
// super() means call the constructor of a super class from child class, by default every class having super()
class A extends Object //Every class have a default extends Object class untill we are mentioning it
{
    public A()
    {
        super();
        System.out.println("in default constructor");
    }
    // By calling "B obj = new B(5);" from main class compiler will not enter below constructor as upper one is default one, after this compiler will go class B parameterized constructor"
    public A(int a)
    {
        System.out.println("in A int a");
    }
}

//In above class A is the Super class & below class B is sub-class

class B extends A
{
    public B()
    {
        // super(5); // We are passing this value to enter class A parameterized constructor, this is called multi=level inheritance
        super();
        System.out.println("in default constructor");
    }
    //Without passing any int value from main class, by running this code it will not enter below parameterized constructor. Will be stays above default constructor
    public B(int n)
    {
        // this(); // This() will call the all constructor of same class & the default one of Super class
        super(n); // If you want to enter parameterized constructor, you have to explicitly mention super() with value
        //By default super() will check for the super class default constructor
        System.out.println("in B int n");
    }
}


public class PSuper_method {
    public static void main(String args[])
    {
        // B obj = new B();
        B obj = new B(5);
        
        
        // System.out.println(x);
    }
}