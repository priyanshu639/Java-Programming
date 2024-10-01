public class Qs {
    int partition(int arr[],int low,int high){
        int pivot =arr[low];
        int st=low;
        int end=high;
        int k=high;
        for(int i=high;i>low;i--){
            if(arr[i]>pivot)
            swap(arr,i,k--);
        }
        swap(arr,low,k);
        return k;
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public void quickSort(int arr[],int low ,int high){
        if(low<high){
            int idx=partition(arr,low,high);
            quickSort(arr, low, idx-1);
            quickSort(arr,idx+1, high);
        }
    }
    void printArry(int arr[],int size){
        int i;
        for(i=0;i<size;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    

    public static void main(String[] args) {
        int arr[]={7,6,10,5,9,2,1,15,7};
        int n=arr.length;
        Qs ob=new Qs();
        ob.quickSort(arr,0,n-1);
        System.out.println("sorted array");
        ob.printArry(arr,n);
        
    }
    
}