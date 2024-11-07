public class mergeSORT{
    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
    }
    System.out.println();
}

    public static void mergeSort(int arr[],int si,int ei){
        // base case
        if(si>=ei){
            return;

        }
        int mid=si+(ei-si)/2; //(si+ei)/2
        mergeSort(arr, si, mid);//left side 
        mergeSort(arr, mid+1, ei);//rigth side
        merge(arr, si,mid, ei); // dono sorted ko merge karega
    }
    public static void merge(int arr[],int si,int mid,int ei ) {
        //left(0,3)=4 and right(4,6)=3-->(ei-si+1)=6-0+1=>7
        int temp[]= new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        // for leftover element of 1st sorted part
        while(i<=mid){
            temp[k++]=arr[i++];

        }
        // for leftover element of 2nd sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        // copy temp to the original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        Printarr(arr);

    }

}