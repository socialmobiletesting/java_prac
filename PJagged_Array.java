public class PJagged_Array {
    
    public static void main(String a[])
    {
        int num[][] = new int[3][];
        //Assigining Array size of each index which is a Jagged Array
        num[0] = new int[3];
        num[1] = new int[2];
        num[2] = new int[1];

        // int num[][][] = new int[3][][]; // 3 Dimentional Array, check picture 3Dimentional_Array.png

        for (int i=0;i<num.length;i++) // num.length = We are getting the exact length of each Array
        {
            for (int j=0;j<num[i].length;j++) // length of each Array will be stored into variable i
            {
                num[i][j] = (int) (Math.random()*100);
                
            }

        }
        
        
        
        for (int n[] : num) // Here n define as a variable of single dimentional Array so we have to give [] after n
        {
            for (int m : n) // Here m is define as varibale which will pick individual(0,1,2,3) values from n[] which is representing behalf of Array
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
