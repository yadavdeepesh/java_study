package collection;
import java.util.*;

public class Test {
    public static void main(String[] args) {   
        // Creating a Collection of String type using ArrayList implementation
        Collection<String> fruits = new ArrayList<>();
        // Adding elements to the collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("After the Add the element +++++++++");
        GFGTest.collList(fruits);
        // Removing an element from the collection
        fruits.remove("Banana");
        System.out.println("After the remove the element ++++++++");
        GFGTest.collList(fruits);
    }
}
