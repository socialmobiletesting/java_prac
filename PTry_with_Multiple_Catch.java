public class PTry_with_Multiple_Catch {
    public static void main(String args[]){
        
        int i = 0; //global variables
        int j = 0; //global variables
        

        int num[] = new int[5];
        num[1] = 4; //Defining array where num[1] is 4 & rest are 0
        
        try
        {
            i = 0; //local variables
            j = 18/i; //As i is 0 hence throw error as exception, which catching in as e
            /*
             * if you gave i = 0 then rest of below code not work,
             * directly code will jump to catch block
             */
            System.out.println(j);
            System.out.println(num[0]);
            System.out.println(num[5]);
        }
        //This will be catch first as i is 0 which is Arithmetic exception
        catch(ArithmeticException e)
        {
            System.out.println("Can't devide by zero");
  
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You are going outside of Array bound");
  
        }
        //if suppose there any exception which unable to handle by me, then
        //it will be printed in below catch block
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }


        // //Another exception with Array 
        // try{
        //     i = 0;
        //     j = 18/num[5]; // 5 is out of bound in array, it will throw exception
        //     System.out.println(num[0]);
        //     System.out.println(num[5]);

        // }catch(ArithmeticException e)
        // {
        //     System.out.println("Can't devide by zero");
  
        // }
        // //This will be catch first as num[5] first will fetch by java
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("You are going outside of Array bound");
  
        // }


        // String str = null;

        // try
        // {
        //     i = 2;
        //     j = 18/i;
            
        //     System.out.println(j);
        //     System.out.println(num[0]);
        //     System.out.println(num[1]);
        //     System.out.println(str.length());
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("Can't devide by zero");
  
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("You are going outside of Array bound");
  
        // }
        // //if suppose there any exception which unable to handle by me, then
        // //it will be printed in below catch block
        // catch(Exception e)
        // {
        //     System.out.println("Something went wrong");
        // }

        System.out.println("I am at finish line");
        
    }
}
