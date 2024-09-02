public class printPrimeRange {
    public static boolean isPrime(int a){
        if(a==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }



    public static void primeRange(int a){
        
    
        for(int i=2;i<=a;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
        

    public static void main(String[] args) {
        primeRange(20);
    }
    
}
