package hashtable_study;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        // create the table add some values 
        Map<String, Integer> table = new Hashtable<>();

        table.put("Pen",10);
        table.put("book",200);
        table.put("blanket", 2000);
        table.put("mobile", 10000);

        // add the 100 of each value using forEach()

        table.forEach((k,v)->{
            v = v + 100;
            table.replace(k, v);
        });

        // print new mapping using forEach()

        table.forEach((k,v)->{
        System.out.println("key : "+k+" value :"+v);}
        );
        
    }
    
}
