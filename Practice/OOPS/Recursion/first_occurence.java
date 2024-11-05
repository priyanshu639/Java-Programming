public class first_occurence {
    public static int firstOccur(int arr[],int key,int i){
        if(arr[i]==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr, key, i+1);

    } 
    public static void main(String[] args) {
        int arr[]={3,6,3,5,8,3,9,4,2};
        int key=5;
       System.out.println(firstOccur(arr,key,0));
    }
    
}
