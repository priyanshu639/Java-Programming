

public class sumOfNatural {
    public static int sumofnum(int n){
        if(n==1){
            return n;
        }
        
        int num=sumofnum(n-1);
        int sn=(n+num);
        return sn;
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumofnum(n));
    }
    
}
