public class floyds_triangle {
    public static void FloydsTRIANGLE(int n){
        int count=1;
        // for outer lines
        for(int i=1;i<=n;i++){
            // inner--> how many times will counter be printed
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();

        }
    }
    public static void main(String[]args){
        FloydsTRIANGLE(5);
    }
    
}
