public class logical_operators 
{
    public static void main(String[] args)
    {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        //Part of math And(&),Or(|),Not(!) gate

        boolean result = x < y || a < b || a > 10;
        System.out.println(result);
        //If you gives ! before variable then opposite value will come
        System.out.println(!result);

        //AND Operator ( && ) – if( a && b ) [if true execute else don’t]
        //OR Operator ( || ) – if( a || b) [if one of them is true to execute else don’t]
        //NOT Operator ( ! ) – !(a<b) [returns false if a is smaller than b]

    }
    
}
