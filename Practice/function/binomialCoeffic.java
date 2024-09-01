public class binomialCoeffic {

    public static int factorial(int a){
        int f =1;
        for(int i=1;i<=a;i++){
            f=f*i;

        }
        return f;
    }
    public static int binnomialcoefficient(int n,int r){
       int n_fact=factorial(n);
       int r_fact=factorial(r);
       int  nmr_fact=factorial(n-r);
       int bc=(n_fact/(r_fact*nmr_fact));
       return bc;
    }
    public static void main(String[]args){
        System.out.println(binnomialcoefficient(5,2));
    }
    
}
