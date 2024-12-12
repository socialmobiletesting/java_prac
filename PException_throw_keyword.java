public class PException_throw_keyword {
    public static void main(String args[]){
        int i = 0;
        int j = 0;
        
        try
        {
            i = 20;
            j = 18/i;

            //if you want to print any msg you can print in constructor
            if(j==0){
                throw new ArithmeticException("Zero is not permitted");
            }            
        
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("This is the default output" + e);
  
        }
        System.out.println(j);

        

    }
}
