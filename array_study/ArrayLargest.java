package array_study;

public class ArrayLargest {
    static int largestArray(int arr[]){
        int max = arr[0];
        for( int i = 1; i< arr.length ; i++){
            if(max < arr[i]){
                max=arr[i];
            }

        }
        return max;

    }
    static int[] reverseArray(int arr[]){
        // approach one 
    //   for(int i = 0 ;i < arr.length / 2; i++){
    //     int temp = arr[i];
    //     arr[i] = arr[arr.length-i-1];
    //     arr[arr.length-i-1] = temp;
    //   }
    
        // approch second
        int temp[]= new int[arr.length];

        for(int i = arr.length-1 ; i >= 0 ; i--){
            temp[temp.length-i-1] = arr[i];
        }
        return temp;
        // to revserse the array element 
    }
}
