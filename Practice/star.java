// public class star {
//     public static void main(String[] args) {
//         for(int i=1;i<=6;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();

//         }
//     }
    
// }
// public class star{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=4;j>=i;j--){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }
public class star{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){  //for rows
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

                for(int k=1;k<=2*i-1;k++){
                    System.out.print(" *");
                }
                
                System.out.println(); 

            }
            
            

        }
    
}