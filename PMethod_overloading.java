class calculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public double add(double n1, int n2) // double + int will give value with different type
    {
        return n1 + n2;
    }
    // public int add(int n1, int n2)
    // {
    //     return n1 + n2;
    // }
}

public class PMethod_overloading {
    public static void main(String args[])
    {
        calculator obj = new calculator();
        int result = obj.add(5, 9);

        calculator obj1 = new calculator();
        int result1 = obj1.add(10, 20);

        
        System.out.println(result);
        System.out.println(result1);
        
    }
}
