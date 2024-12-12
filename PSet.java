// import java.util.ArrayList;
// import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PSet {
    public static void main(String[] args) {


        Set<Integer> nums = new HashSet<Integer>();
        // Duplicates will be removed, and data output will be arranged in order
        nums.add(5);
        nums.add(3);
        nums.add(5);
        nums.add(1);

        // System.out.println(nums.get(2)); // For list<> we can get index value
        for (int n : nums) {
            System.out.println(n);
        }

    }
}
