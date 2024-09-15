public class insertion_sort {
    public static void insertionsort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while ((j>-1)&&(arr[i]>key)) {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,67,5,9,4,98};

        System.out.println("before insertion sort");
        for(int i:arr){
            System.out.print(i+" ");

        }
        System.out.println();
        insertionsort(arr);
        System.out.println("after insertion");
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    
}
