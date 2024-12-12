class Pternary_operator
{
    public static void main(String args[])
    {
        int i = 4;
        int result = 0;

        // if (i%2==0)
        //     result = 10;
        // else
        //     result = 20;

        // if i%2==0 asking the condition with (?)
        // if i%2==0 is true then print 50 (First value after "? 50")
        // else print later value (":20")
        // This one liner call Ternary operator (?:)

        result = i%2==0 ? 50 : 20;

        System.out.println(result);
    }


}