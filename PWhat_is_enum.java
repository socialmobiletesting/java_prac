
//We can print constants/objects under Status class of enum
enum Status
{
    Running, Walking, Swiming, Jumping;
}

public class PWhat_is_enum 
{
    public static void main(String args[])
    {
        //Using name constant Status.Running for call
        Status var = Status.Running;
        System.out.println(var);
        //ordinal() will tell the position of the constant
        System.out.println(var.ordinal());

        //By default values are statring from 0,1,2,3
        //Status.values() will give the array
        Status[] var1 = Status.values();
        System.out.println(var1[0]);

        //If you want to print all status then by using for loop we can iterate
        for (Status itr : var1)
        {
            System.out.println(itr);
        }
    }
}
