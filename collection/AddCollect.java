package collection;
import java.util.*;

public class AddCollect {
    public static void main(String[] args) {
        // create the collection using Arraylist

        Collection<Integer> numbers = new ArrayList<>();

        // add the element in collection 
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // create the another collection 

        Collection<Integer> morenumbers = new ArrayList<>();
        // add the element in another collection 
        morenumbers.add(40);
        morenumbers.add(50);
        morenumbers.add(60);

        // after adding elements numbers collection
        numbers.addAll(morenumbers);

        System.err.println("after adding the element :: "+numbers);
    }
    
}
