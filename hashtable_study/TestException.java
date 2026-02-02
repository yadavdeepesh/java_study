package hashtable_study;

import java.util.*;

public class TestException{
    public static void main(String[] args) {
        // create the table add some values 

        Map<Integer, String> table = new HashMap<>();

        table.put(1, "100Rs");
        table.put(2, "200Rs");
        table.put(3, "300Rs");
        table.put(4, "400Rs");
        table.put(5, "500Rs");

    try{
            table.forEach((k,v)->{
                        v = v + 100;
                        table.put(null, v);
            }); 
    }
    catch (Exception e){
        System.out.println("Exception: " + e);
    }
      
    }
} 