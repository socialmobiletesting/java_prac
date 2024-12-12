
@FunctionalInterface
interface Test5
{
    void show(int i);
}


// public class Plamda_expression
// {
//     public static void main(String args[])
//     {
//         Test5 obj = new Test5()
//         {

//             public void show(int i)
//             {
//                 System.out.println("in show" + i);
//             }
//         };
//         obj.show(5);
//     }   
// }

// public class Plamda_expression
// {
//     public static void main(String args[])
//     {
//         //Compiler will understand what I am trying to intanciate
//         Test5 obj = () ->
//             {
//                 System.out.println("in show");
//             };
//         obj.show();
//     }   
// }

// public class Plamda_expression
// {
//     public static void main(String args[])
//     {
//         //Compiler will understand what I am trying to intanciate
//         //We can shorten our code by removing curly brckets
//         Test5 obj = (int i) -> System.out.println("in show" + i);
//         obj.show(5);
//     }   
// }

public class Plamda_expression
{
    public static void main(String args[])
    {
        //Compiler will understand what I am trying to intanciate
        //We can shorten our code by removing curly brckets
        //If we have only one variable then we don't need brackets() and int
        Test5 obj = i -> System.out.println("in show" + i);
        obj.show(5);
    }   
}
