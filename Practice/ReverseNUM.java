public class ReverseNUM{
    public static void main(String[]args){
        int numb=123456;
        
        while(numb>0){
            int rev=0;
            rev=rev*10+numb%10;
            numb=numb/10;
            System.out.print(rev);
        }
    }
        
}