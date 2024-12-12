class Computer
{
    public void view()
    {
        System.out.println("in A Show");
    }
}

class Laptop extends Computer
{
   public void view()
    {
        System.out.println("in B Show");
    }
}

class MiniLaptop extends Computer
{
   public void view()
    {
        System.out.println("in C Show");
    }
}



public class PDynamic_Method
{
    public static void main(String a[])
    {
        Computer obj = new Laptop(); //Parent and child also can work
        // Its possible to create a reference of super class Computer and object of sub class Laptop
        // Computer obj = Laptop A();
        obj.view();

        obj = new Laptop(); // As we are changing the value so previuos object in heap memory will not present "Computer obj = new Laptop();"
        obj.view();

        obj = new MiniLaptop(); // As we are changing the value so previuos object in heap memory will not present "Laptop obj = new MiniLaptop();"
        obj.view();
    }
}

// This method is call Run time Polymorphism