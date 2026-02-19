package compare_method;

public class GFGequal {
    public static void main(String[] args) {

        Short a = Short.valueOf("20");
        Short b = Short.valueOf("20");

        boolean output = a.equals(b);

        System.out.println("Does " + a
                + " equals " + b
                + " : " + output);
    }
}
