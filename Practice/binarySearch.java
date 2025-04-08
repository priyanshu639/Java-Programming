// // using recursion

// public class binarySearch {
//     static int  binary(int arr[],int key,int start,int end){
//         int n=arr.length;
//         int mid=start+(end-start)/2;
        
//         if(arr[mid]==key){
//             return mid;
//         }
//         else if(key<arr[mid]){
//             return binary(arr,key,start,mid-1);
//         }
//         else{
//            return  binary(arr,key,mid+1,end);
//         }
        
        


//     }

//     public static void main(String[] args) {
//         int arr[]={1 , 3 , 5 , 7 , 9 };
//         int key=1;
//         int n=arr.length;
//         int start=0;
        
//         int end=n-1;
        

//        int idx= binary(arr,key,start,end);
//        System.out.println(idx);
        

//     }
    
// }

// using loop

public class binarySearch {
    static  int binary(int arr[],int key,int start,int end){
        int n=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }return -1;


    }

public static void main(String args[]) {
    int arr[]={1,2,3,4,5,6,7};
    int n=arr.length;
    int key=4;
    int start=0;
    int end=n-1;
    int idx=binary(arr,key,start,end);
    System.out.println(idx);
    }
}
