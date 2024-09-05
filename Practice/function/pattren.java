// public class pattren {
//     public static void main(String[] args) {
//         for(int i=0;i<6;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("* ");

//             }
//             System.out.println();
//         }
//     }
    
// }

// public class pattren {
//     public static void main(String[] args) {
//         for(int i=0;i<6;i++){
//             for(int j=2*(6-i);j>=0;j--){
//                 System.out.print("_");

//             }
//             for(int j=0;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }

import java.util.*;
public class pattren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        char n =sc.next().charAt(0);

        switch (n) {
            case 'A': System.out.println("monday");
            break;
            case 'B': System.out.println("tuesday");
            break;
            case 'C': System.out.println("wedneday");
            break;
            case 'D': System.out.println("thrusday");
            break;
            case 'E': System.out.println("friday");
            break;
            case 'F': System.out.println("saturday");
            break;
            case 'G': System.out.println("sunday");
                
                break;
        
            default:
            System.out.println("the number you have enterd is greatter than seven");
                break;
        }
    }
}
        