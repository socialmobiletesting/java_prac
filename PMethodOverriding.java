//Method Overriding through child class to Parent class

// class K
// {
//     public void show()
//     {
//         System.out.println("in K show");
//     }

//     public void config()
//     {
//         System.out.println("in K show");
//     }
// }

// class L extends K
// {
//     public void show()
//     {
//         System.out.println("in L show");
//     }
// }

// public class PMethodOverriding{
    
//     public static void main(String a[])
//     {
        
//         // K obj = new K();
//         L obj = new L(); // It will override parent class method show() with child class method show()
//         obj.show();
//         obj.config();
        
//         // System.out.println(x);
//     }
// }

class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

}

//Below method it's unable to find anything so it's goes to parent method
//If I untag the below method then result will come 13 which means it's overriding parent method add()
class AdvCalc extends Calc
{
    // public int add(int n1, int n2)
    // {
    //     return n1 + n2 + 1;
    // }
}

public class PMethodOverriding{
    
    public static void main(String a[])
    {
        
        AdvCalc obj = new AdvCalc(); // It will override parent class method show() with child class method show()
        int r1 = obj.add(5, 7);
        
        System.out.println(r1);
    }
}