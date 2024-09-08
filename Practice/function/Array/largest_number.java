import java.util.*;
public class largest_number {
    public static int getlargest(int arr[]) {
        int largest = Integer.MIN_VALUE; //minus infinity
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
            return largest;
        

        
    }
    public static void main(String[] args) {
        int arr[] ={3,5,8,9,45,6,4,8,32,16};
        System.out.println("the largest value is " + getlargest(arr));
        
    }
}
