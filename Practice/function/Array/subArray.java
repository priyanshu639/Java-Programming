public class subArray {
    public static void  Print_subarray(int arr[],int n){
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                for(int k=0;k<end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        Print_subarray(arr,n);
    }
    
}
