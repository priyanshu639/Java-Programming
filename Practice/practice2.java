// import java.util.*;
// public class practice2 {
    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int d = sc.nextInt();
        
//         //..... YOUR CODE STARTS HERE .....
//         int result =(a+b)*c;
//         int result1=(b-d)/a;
//         int result2=(a*b)+c;
//         int result3=(a+b+c+d)/2;
//         System.out.println("Result of operation 1:"+ result);
//         System.out.println("Result of operation 2:"+ result1);
//         System.out.println("Result of operation 3:"+ result2);
//         System.out.println("Result of operation 4:"+ result3);
        
        
//         //..... YOUR CODE ENDS HERE .....
//     }
// }
    
import java.util.Scanner;

public class practice2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // Transformations
        //..... YOUR CODE STARTS HERE .....
        if(a%2 ==0){
            a=a+b;
        }
        if(b%2!=0){
            c*=2;
            
            
        }
        if(c%3==0){
            c+=a;
        }
        int sum=a+b+c;
        if(sum>100){
            a -= 100;
            b -= 100;
            c -= 100;
            
        }
        
        //..... YOUR CODE ENDS HERE .....
        // Output
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }
}
