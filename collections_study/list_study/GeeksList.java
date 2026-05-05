package collections_study.list_study;
import java.util.*;

public class GeeksList {

    public static void main(String[] args) {
        // create a list of string using arraylist
        List<String> li = new ArrayList<>();
        // adding the element 
        li.add("java");
        li.add("php");
        li.add("c++");
        li.add("javascript");

        // add the elemnt in index
        li.add(0,"code");

        li.set(4, "type script");

        System.out.println("Elements of List are:");

        // findout the first index value 
        // use indexOf() to find the first occurrence of an element in
        int i = li.indexOf(2);
        System.out.println("First Occurrence of 2 is at Index: "+i);


        // use lastIndexOf() to find the last occurrence of an element in the list
        int l =li.lastIndexOf(2);
      
        System.out.println("Last Occurrence of 2 is at Index: "+l);

        // findout the last index value 

        // Iterating through the list 

        // create a list of integers
        List<Integer> al = new ArrayList<>();

        // add some integers to the list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);

        // use indexOf() to find the first occurrence of an element in the list
        int ii = al.indexOf(2);
      
        System.out.println("First Occurrence of 2 is at Index: "+ii);

        // use lastIndexOf() to find the last occurrence of an element in the list
        int ll = al.lastIndexOf(2);
      
        System.out.println("Last Occurrence of 2 is at Index: "+ll);

        for (String s: li){
            System.out.println(s);
        }
        
    }
    
}
