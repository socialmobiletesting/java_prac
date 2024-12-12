public class PWhile {
    public static void main(String args[])
    {
        int i = 1;
        while(i<=4)
        {
            System.out.println("Hi"+i);
            int j = 1;

            while(j<=3) // Nested while loop
            {
                System.out.println("Hello"+j);
                j++;
            }
            i++; //increament the value one by one
        }
        System.out.println("End"+i); /// As considerig "while(True)" so it's entering in loop but when it's finished with true value "i<=4" then get false value of 5.
        /// Since "i=1" decleared outside of loop so value will be maintained as True & False. 
    }
}
