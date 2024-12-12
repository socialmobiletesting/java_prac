public class conversion_in
{
    public static void main(String args[])
    {

        //CASTING
        int b = 125;
        int a = b;

        byte x = 127;
        int y =(byte) x;

        //Here 257%256=1
        int c = 257;
        byte d = (byte) c;

        //Loss of value .9 on type casting
        float p = 7.9f;
        int q =(int) p;

        //bytes goes to integer as its crossed range of 257, so promoted from byte to int
        byte m = 10;
        byte n =30;
        int result = m*n;

        System.out.println(result);

    }

}
