// package Array;

public class pairs_array {
    public static void pairs(int arr[],int n){
        for(int i= 0;i<n;i++){
            int cuurent =arr[i];
            for(int j =i+1;j<n;j++){
                System.out.print("("+cuurent+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        pairs(arr,n);
        

    }
    
}
