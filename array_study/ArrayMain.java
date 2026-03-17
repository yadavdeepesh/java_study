package array_study;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size of array ..");
        // define the array size 
        int size = kb.nextInt();

        // defining array and initialsing array 
        int arr[] = new int[size];
        System.out.println("Enter the values of array..");
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();
        }

        // int arr[] = {70,67,89,87,65,54,55};
        int largestElement = ArrayLargest.largestArray(arr);
        System.out.println("The Largest Element in arry is "+largestElement);

        // ArrayLargest.reverseArray(arr);
        int rev[] = ArrayLargest.reverseArray(arr);


        System.out.println("print the reverse values of array ..");
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
         for(int i=0;i<rev.length;i++){
            System.out.println(rev[i]);
        }

        kb.close();


    }
}
