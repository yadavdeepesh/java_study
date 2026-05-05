package collections_study.list_study;

import java.util.ArrayList;
import java.util.List;

public class GeeksListAccess {
     public static void main(String args[])
    {

        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface
        al.add("Geeks");
        al.add("For");
        al.add("Geeks");

        // Accessing elements using get() method
        String first = al.get(0);
        String second = al.get(1);
        String third = al.get(2);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(al);

          // Checking if element is present using contains() method
        boolean isPresent = al.contains("Geeksee");

        // Printing the result
        System.out.println("Is Geeks present in the list? "+ isPresent);

        List<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

         // Using  for loop for iteration
         for (int i = 0; i < num.size(); i++){
            System.out.print(num.get(i)+" ");
         }

         // using for each loop 
         System.out.println("++++++");

         for (Integer index : num) {
            System.out.print(index+" ");
            
         }
    }
}
