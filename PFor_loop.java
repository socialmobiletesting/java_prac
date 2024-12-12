public class PFor_loop {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        // for(int i=5;i>=1;i--)
        {
            System.out.println("Day" + i);
            for(int j=10;j>=1;j--)
            {
                System.out.println((j+9)+"-"+"10pm");
            }

            // System.out.println(i+9);
        }
    }
}
