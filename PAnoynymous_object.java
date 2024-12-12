class TestClass1
{
    public TestClass1()
    {
        System.out.println("Created a constructor");
    }
    
    public void show()
    {
        System.out.println("in to show");
    }
}

public class PAnoynymous_object
{
    public static void main(String args[])
    {
        //Default method
        // TestClass1 obj = new TestClass1();
        // obj.show();
        
        //Let's extract the above code
        // TestClass1 obj; // Reference variable created
        // obj = new TestClass1(); // With reference variable of "obj" we assigning a new object "new TestClass1()" in Heap memory
        // obj.show();

        //Similar concept applied above like below
        // int marks;
        // marks = 99;
        // System.out.println(marks);

        new TestClass1(); // This is called Anonymous variable, we don't need reference variable/object here, directly with help of constructor we are creating new object
        //Limitation is above variable we can't use again, if we use then new object will be created in heap memory
        //Example: Two time object will be printed
        // new TestClass1();
        // new TestClass1();
        new TestClass1().show();

    }
}