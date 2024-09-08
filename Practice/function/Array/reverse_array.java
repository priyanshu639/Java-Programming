// package Array;

public class reverse_array {
    public static void reverse(int arr[],int n){
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        reverse(arr,n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
