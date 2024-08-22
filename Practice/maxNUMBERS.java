public class maxNUMBERS{
    public static void main (String[]args){
        int a = 5;
        int b = 10;
        int c = 8;
        int max;
        if (a>=b && a>=c){
            max=a;
        
        } else if (b>=a && b>=c){
            max=b;
        } else {
            max=c;
        }
        System.out.print(max);

    } 
}