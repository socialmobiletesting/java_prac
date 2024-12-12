import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.TreeSet;
import java.util.Map;


/*
 * Set : A Set is a collection that does not allow duplicate elements. 
 * Java provides several implementations of the Set interface 
 * such as HashSet, LinkedHashSet, and TreeSet.
 */

// public class PSet_List_Dict {
//     public static void main(String[] args) {
        
//         // Set<String> set = new HashSet<>();
//         // Set<Integer> set = new HashSet<>();  // Removes the duplicate values
//         // Set<Integer> set = new LinkedHashSet<>();   // Maintains the insertion order of elements
//         Set<Integer> set = new TreeSet<>(); // Stores elements in a sorted (ascending) order
//         // set.add("Apple");
//         // set.add("Mango");
//         // set.add("Potato");
//         set.add(5);
//         set.add(10);
//         set.add(6);
//         set.add(6); // duplicate value will be removed

//         for(Integer fruits : set){
//             System.out.println(fruits);
//         }

//     }
// }

/*
 * List : A List is an ordered collection that allows duplicate elements. 
 * Java provides several implementations of the List interface, 
 * such as ArrayList, LinkedList, and Vector.
 */

// public class PSet_List_Dict {
//     public static void main(String[] args) {
        
//         // List<Integer> list = new ArrayList<>();  // Resizable array. Provides random access to elements.
//         List<Integer> list = new LinkedList<>();    // Doubly linked list. Useful when frequent insertions and deletions are required.
//         list.add(4);
//         list.add(2);
//         list.add(5);
//         list.add(9);

//         for(Integer values : list){
//             System.out.println(values);
//         }

//     }
// }


/*
 * Dictionary : In Java, a Map is the closest alternative to a Python dictionary. 
 * It stores key-value pairs and does not allow duplicate keys. 
 * The Map interface has several implementations such as HashMap, LinkedHashMap, and TreeMap.
 */

public class PSet_List_Dict {
    public static void main(String[] args) {
        
        // Map<Integer, String> map = new HashMap<>();  // Stores key-value pairs in a hash table. No guarantee of order.
        Map<Integer, String> map = new LinkedHashMap<>();   // Maintains insertion order.
        map.put(1, "Apple");
        map.put(3, "Mango");
        map.put(2, "Onion");
        

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry);
        }

    }
}