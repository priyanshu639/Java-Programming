public class passing_array {
    public static void update(int arr[]){
        // for printing array
      
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[]args){
        int arr[] ={4,5,6};
        update(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    
    
}
