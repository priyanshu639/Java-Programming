

public class fibonacci {
    public static int fiboterm(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1=fiboterm(n-1);
        int fibnm2=fiboterm(n-2);
        int fibn = fibnm1+fibnm2;
        return fibn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fiboterm(n));
    }
    
}
