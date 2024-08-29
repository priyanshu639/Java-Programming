public class numberReverse {
    public static void main(String[]args){
        int n=10453;
        
        int lastdigit;
        while(n>0){
            lastdigit=n%10;
            n=n/10;
            System.out.print(lastdigit);
        }
        
        // for(int i=0;i<n;i++){
        //     lastdigit=n%10;
        //     n=n/10;
        //     System.out.print(lastdigit);
            

        
    }
}
