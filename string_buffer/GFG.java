package string_buffer;

public class GFG {
    public static void main(String[] args) {
        // create the object of string buffer class
        StringBuffer str = new StringBuffer();
         // add the String to StringBuffer Object
         str.append("Deepesh yadav ");

          // get unicode of char at position 10
          int unicode = str.codePointAt(10);
            // print the result
        System.out.println("Unicode of Character "
                           + "at Position 10 "
                           + "in StringBuffer = "
                           + unicode);

      // create the string buffer obejct pass the string parameter
      StringBuffer str2 = new StringBuffer("Hello my name is deepu");

      try{
          // get char at position 25 which is
            // greater then length
        int i= str2.codePointAt(25);
      }
       catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}
