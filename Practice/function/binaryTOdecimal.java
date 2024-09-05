
public class binaryTOdecimal {
    public static void binNum(int a){
        int pow=0;
        int decimal=0;
        while(a>0){
            int lastdigit=a%10;
            decimal=decimal+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            a=a/10;

        }
        System.out.println(decimal);
    }



    public static void main(String[]args){
        binNum(1000);
    }
    
}
