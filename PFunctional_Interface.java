/*
 * Funtional interface having only one method inside
 * If you try another then it will throuw error
 * Java 8 lamda expression introduced which will work in @FunctionalInterface
 */

@FunctionalInterface
interface Test3
{
    void show();
}

//Instead of using a concreate class for intantiate the method
//we can include the method into main class line 22 which is Annonymous class 
// class Test4 implements Test3
// {
//     public void show()
//     {
//         System.out.println("In Test3 Show");
//     }
// }


public class PFunctional_Interface
{
    public static void main(String args[])
    {
        Test3 obj = new Test3()
        //implements Test4 method directly here
        {
            public void show()
            {
                System.out.println("In Test3 Show");
            }
        };
        obj.show();
    }
}

