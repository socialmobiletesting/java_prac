import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();  // Stores key-value pairs in a hash table. No guarantee of order.
        // Map<Integer, String> map = new LinkedHashMap<>();   // Maintains insertion order.
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");
        

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry);
        }

        if("Sepetember".compareTo("February") > 0){
            System.out.println("January comes after February");
        }else {
            System.out.println("January comes before February");
        }

    }
}
