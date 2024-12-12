@FunctionalInterface
interface Test{
    int add(int x, int y);
    
}

public class MyTest {
    public static void main(String[] args) {
        Test obj = new Test()
        {
            public int add(int x, int y){
                return x+y;
            }
        };

        int result = obj.add(15,20);
        
        
        System.out.println(result);
    }
}