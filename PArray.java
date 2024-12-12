public class PArray {
    public static void main(String a[])
    {
        // int num[] = {3,7,9,5}; // 3,7,9,5 static values are assigned as 0,1,2,3 in Array
        int num[] = new int[4]; // All values are set as 0
        num[0] = 4;
        num[1] = 6;
        num[2] = 7;
        num[3] = 2;
        
        for (int i=0;i<=3;i++)
        {
            System.out.println(num[i]);
        }
        // System.out.println(num[0]);
    }
}
