package java_programs;

public class Test {
       public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 6, 10, 78, 90, 12};
        int key = 78;

        boolean res = SearchData.isElementPresent(arr, key);
        System.out.println("Is " + key + " present in the array: " + res);

        System.out.println("max element in gieven array is "+SearchData.largest(arr));
    }
}
