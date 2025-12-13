package dsa_programs;

public class LinearSearch {
    public static int search(int arr[],int len, int findData){
        for(int i = 0;i < len ; i++){
            if(arr[i] == findData){
                return i;
            }

        }
        return -1;
    }
    
}
