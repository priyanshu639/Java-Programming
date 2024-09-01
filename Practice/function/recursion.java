// to print n numbers from n to 1?

public class recursion {
    public static void main(String[]args){
        printnumber(10);
    }
    public static void printnumber(int n){
        if(n==0) return;
        System.out.println(n);
        printnumber(n-1);
        
        

    }
}




