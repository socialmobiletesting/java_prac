class conversion_casting
{

    public static void main(String args[])
    {
        //260 will be devided with 256 and reminder value will come i.e. 4
        int d = 260;
        byte k = (byte) d;

        //We loss the data of .6
        float f = 5.6f;
        int t = (int) f;

        //Type promotion: when byte*byte gone beyond 257, it will promote to integer
        byte a = 10;
        byte b = 30;
        int result = a * b;


        System.out.println(result);
        System.out.println(k);
        System.out.println(t);
    }
}