package array_study;

public class MainRun {
    public static void main(String[] args) {
        int[] a = {3, 4, 1, 7, 5};
        int len = a.length;
        int search = 7;

        int index = LinearSearch.search(a,len,search);
        if(index == -1){
            System.out.println("Element is not present in the array ");
        }
        else{
             System.out.println("Element found at index: " + index);
        }
    }
}
