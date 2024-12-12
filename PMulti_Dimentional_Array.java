public class PMulti_Dimentional_Array {
    public static void main(String a[])
    {
        // int num[] = {3,7,9,5}; // 3,7,9,5 static values are assigned as 0,1,2,3 in Array
        int num[][] = new int[3][4]; //[3] Means 3 Array(Rows) outbound and [4] means 4 values(Columns) inbound in each Array, mentioned in pic PMulti_Dimentional_Array.png
        
        for (int i=0;i<3;i++) // Going into the loop of index / row of Arrays
        {
            for (int j=0;j<=3;j++) // Going into the loop of each Arrays
            {
                num[i][j] = (int) (Math.random()*100);
                //random values will be assigned & Math library will assign less than 1.0 double values so multiplied with 100. Then we will get two digit value & later we are doing type casting with (int) 
            }

        }

        // Defining Arrays
        // num[0][0] = 4;
        // num[0][1] = 6;
        // num[0][2] = 7;
        // num[0][3] = 2;
        // num[1][0] = 6;
        // num[1][1] = 4;
        // num[1][2] = 5;
        // num[1][3] = 9;
        // num[2][0] = 8;
        // num[2][1] = 1;
        // num[2][2] = 3;
        // num[2][3] = 6;
        
        for (int i=0;i<3;i++) // It will iterate outside Array loop 0,1,2,3, mentioned in pic PMulti_Dimentional_Array.png
        {
            for (int j=0;j<=3;j++) // It will iterate outside Array loop 0,1,2,3, mentioned in pic PMulti_Dimentional_Array.png
            {
                System.out.print(num[i][j] + " "); // Removed ln from println so every values will be printed in same line & " " means space between next valew
            }
            System.out.println(); // Given this out of nested loop so whenever one Row will be complete the loop comes out to new line

        }
        // System.out.println(num[1][3]);

        //Enhanced for loop
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
