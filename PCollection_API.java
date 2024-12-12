/*
 * The concept of a "collection of APIs" refers to a suite or set of related APIs 
 * that are designed to work together to provide a comprehensive solution for a particular problem 
 * or set of functionalities
 */

/*
 *          Collection types:
 * List         Queue       Set
 * ArrayList    DeQueue     HashSet
 * LinkedList               LinkedHashSet
 * 
 */ 

import java.util.ArrayList;
import java.util.Collection;
// import java.util.List;

public class PCollection_API {

    public static void main(String[] args) {

        // List<Integer> nums = new ArrayList<Integer>();
        Collection<Integer> nums = new ArrayList<Integer>();
        // Below attributes are objects until we add <>types
        nums.add(5);
        nums.add(3);
        nums.add(6);
        nums.add(1);

        // System.out.println(nums.get(2)); // For list<> we can get index value
        for (int n : nums) {
            System.out.println(n);
        }

    }

};
