

public class increasing_ord {
    public static void printInc(int n){
        if(n==20){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printInc(n+1);
    }

    public static void PRINT_INC(int num){
        if(num==1){
            System.out.println(num);
            return;
        }
        PRINT_INC(num-1);
        System.out.println(num);

    }

    public static void main(String[] args) {
        int n=1;
        int num=20;
        printInc(n);
        PRINT_INC(num);
    }
    
}
