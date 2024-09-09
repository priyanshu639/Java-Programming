public class maximum_Subarry_sum {
    public static void maximumSubbaray(int arr[],int n){
        int maxSum=Integer.MIN_VALUE;
        int cuurent_sum=0;
        for(int i=0;i<n;i++){
            
            int start=i;
            for(int j=i;j<n;j++){
                cuurent_sum=0;
                int end=j;
                for(int k=start;k<=end;k++){
                    cuurent_sum +=arr[k];

                }System.out.println(cuurent_sum);
                    if(maxSum<cuurent_sum){
                        maxSum=cuurent_sum;
                    }

                }
            }
            System.out.println("max sum = "+maxSum);
        }
    

    public static void main(String[] args) { 
        int arr[]={1,-2,6,-1,3};
        int n= arr.length;
        maximumSubbaray(arr,n);
    }
}