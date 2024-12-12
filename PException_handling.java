/*
 * Types of exception
 * 1. Compile time error (e.g. Unable to compile as you can't devide with 0)
 * 2. Runtime error -> Exception handling so code execution will continue
 * 3. Logical error (e.g. No error but end result is different)
 */


public class PException_handling
{
    public static void main(String args[])
    {
        int i = 0;
        //Declare the variable of j as 0
        int j = 0;

        try
        {
            j = 18/i;
        }
        //catch block will be executed only in case of execution
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
    }
}
