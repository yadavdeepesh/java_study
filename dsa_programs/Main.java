package dsa_programs;

public class Main {
    public static void main(String args[]){
        int arr[] = {2,3,5,10,40};
        int findValue = 10;
        
        int result = LinearSearch.search(arr, arr.length, findValue);
        
        if(result == -1){
            System.out.println("Element is not found ..");
        }
        else{
            System.out.println(arr[result]+" Element is found index "+ result);
        }
    }
    
}
