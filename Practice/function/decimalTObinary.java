public class decimalTObinary {

    public static void decTobin(int n){
        int binNum=0;
        int pow =0;
        while(n>0){
        int rem =n%2;
        binNum=binNum+(rem*(int)Math.pow(10,pow));
        n=n/2;
        pow++;
        }
        System.out.println(binNum);
    }
    public static void main(String[]args){
        decTobin(8);
    }
    
}
