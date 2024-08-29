public class reversin_num {
    public static void main(String[]args){
        int n=12345654;
        int reverse=0;
        int lastdigit;
        while (n>0){
            lastdigit=n%10;
            
            reverse=(reverse*10)+lastdigit;
            n=n/10;
        }    


         System.out.println(reverse);
    }
    
}
