public class backtrackingOn_Arry {
    public static void changeArr(int[] arr,int i,int value){
        if(i==arr.length){
            printarry(arr);
            return;
        }
        arr[i]=value;
        changeArr(arr, i+1, value+1);
        // backtracking
        arr[i]=arr[i]-2;

    }
    public static void printarry( int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        changeArr(arr,0,1);
        printarry(arr);
    }
    
}
