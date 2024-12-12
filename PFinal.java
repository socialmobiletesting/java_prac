// final - variable, method, class

//variable
// public class PFinal 
// {
//     public static void main(String a[])
//     {
//         final int num = 8;
//         // num = 9; //Can't assign new value of num as final value assigned before
//         System.out.println(num);
//     }
// }

//class
final class Himalayan_v1
//Once you made your method final no one will extends your method through class
// final class Himalayan_v1
{
    public void show()
    {
        System.out.println("in Himalayan_v1_show");
    }
    public void price(int a, int b)
    {
        System.out.println(a + b);
    }
}

//As final keyword has been putted in Parent class so can't inherit
class AdvHimalayan_v1 extends Himalayan_v1
{
    public void show()
    {
        System.out.println("in Advance Himalayan_v1_show");
    }

}

public class PFinal 
{
    public static void main(String a[])
    {
       AdvHimalayan_v1 obj = new AdvHimalayan_v1();
       obj.show();
       obj.price(4, 3);
       
    //    System.out.println(num);
    }
}

