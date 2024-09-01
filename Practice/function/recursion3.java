public class recursion3 {
    public static void main(String[]args){
        int n=100;
        int sum=sumOfNumber(n);
        System.out.println(sum);

    }
    
    public static int sumOfNumber(int n){
        if(n==1){
            return 1;
        }
        return n + sumOfNumber(n-1);
    }
}
