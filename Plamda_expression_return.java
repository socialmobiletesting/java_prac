//lamda expression only worked with functional interface
//In case of expression if we have both method add & sub
//In that case lamda expression will be confused with method need to apply
//So because of multiple method lemda will not work
//If you add second method under @functionalinterface then 
//It will throw error

@FunctionalInterface
interface Test7
{
    int add(int i, int j);
}


// public class Plamda_expression_return
// {
//     public static void main(String args[])
//     {
//         Test7 obj = new Test7() {
//             public int add(int i, int j)
//             {
//                 return i+j;
//             }
//         };
//         int result = obj.add(6, 10);
//         {
//             System.out.println(result);
//         }
//     }
// }

// public class Plamda_expression_return
// {
//     public static void main(String args[])
//     {
//         Test7 obj = (int i, int j) ->
//             {
//                 return i+j;
//             };
//         int result = obj.add(6, 10);
//         {
//             System.out.println(result);
//         }
//     }
// }

public class Plamda_expression_return
{
    public static void main(String args[])
    {
        //In lamda expression no need of int
        //Also don't mention return as i+j already an expression
        Test7 obj = (i, j) -> i+j;
            
        int result = obj.add(6, 10);
        {
            System.out.println(result);
        }
    }
}