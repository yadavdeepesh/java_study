package collections_study.list_study;

import java.util.HashSet;
import java.util.Set;

public class GeeksSet {
    public static void main(String[] args) {
        // create a set using HashSet
        Set<String> s = new HashSet<String>();
           // Displaying the Set
        System.out.println("Set Elements: " + s);
        s.add("B");
        s.add("B");
        s.add("C");
        s.add("A");
        s.add("D");
        s.add("E");

        // System.out.println(s);

        System.out.println("Set is " + s);

        String search = "C";

        System.out.println("Contains " + search + " " + s.contains(search));

        System.out.println("Initial HashSet " + s);

        // Removing custom element using remove() method
        s.remove("B");
        System.out.println("After removing element " + s);

          // Iterating through the Set via for-each loop 
        for (String value : s)

            // Printing all the values inside the object 
            System.out.print(value + ", ");
        
        System.out.println();
    }

    
}
