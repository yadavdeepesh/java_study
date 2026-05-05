package collections_study;

import java.util.*;

public class ArrList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // add element
        list.add("java");
        list.add("c++");
        list.add("php");
        list.add("python");

        // remove one value
        list.remove("java");

        // Printing the elements of the ArrayList
        System.out.println("Programming Languages:");

        for (String lang : list) {
            System.out.println(lang);
        }

    }

}