
public class PAssignment_Operator {
    public static void main(String args[])
    {
        int test1 = 15;
        int test2 = 7;

        int result = test1 % test2;
        // test1 = test1 + 2;
        // test1 +=2; //increament the value
        // test1 *=2;//multiply the value
        // test1 -=2; //substraction
        // test1 /=2;
        // test1++; //incrementing value
        // test1--; //decrementing value

        // ++test1; //pre-increment

        int var = test1++; //here we have two statement "test1 = test1+1"
        //First var will fetch the value of test1 then increment will happen

        // System.out.println(result);
        // System.out.println(test1);
        System.out.println(var);
    }
}
