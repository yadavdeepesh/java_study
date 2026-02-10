package string_builder;

public class GFG {
    public static void main(String[] args) {
        // create the randow array string array ..
        String gfg[] = {"Are","a","you","programmer"};
        // create the object of string builder class 
       StringBuilder obj = new StringBuilder();
      
        // Adding above arrays of strings to
        // Stringbuilder object
          for (String value : gfg) {
                obj.append(value);
            }

        // Note if elements are more then
        // we will be using loops to append(add)

        // Creating a single string
        String str = obj.toString();

        // Print and display the above string
        // containing all strings as a single string
        // using toString() method

        System.out.println(
            "Single string generated using toString() method is --> "
            + str);

    }
}
