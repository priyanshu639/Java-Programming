public class butterflyPattern {
    public static void butterfly(int n){
        // 1st half

        //for line
        for(int i=1;i<=n;i++){
            // for stars-->i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                // for spaces-->2*(n-i)
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                    // for stars-->i
                    for(int j=1;j<=i;j++){
                        System.err.print("*");
                    }
                
                    System.out.println();
                }
                
                // 2nd half
                for(int i=n;i>=1;i--){
                    // for stars-->i
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                        // for spaces-->2*(n-i)
                        for(int j=1;j<=2*(n-i);j++){
                            System.out.print(" ");
                        }
                            // for stars-->i
                            for(int j=1;j<=i;j++){
                                System.err.print("*");
                            }
                        
                            System.out.println();
                        }

        }
    
    public static void main(String[]args){
        butterfly(4);
    }
    
}
