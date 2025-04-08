import java.util.*;
public class Arraypalin {
    public static  boolean palindrome(int arr[],int n){
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==arr[j])
            {
                i++;
                j--;
            }
            else{
                return false;
            }
           

        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        boolean ans =palindrome(arr,n);
        if(ans){
            System.out.println("palindrome");

        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();



    }




}

