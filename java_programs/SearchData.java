package java_programs;
class SearchData {
    public static boolean isElementPresent(int arr[] , int key ){
        for ( int element : arr){
            if( element == key){
                return true;
            }
        }
        return false;
    }

    public static int largest(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

     
}