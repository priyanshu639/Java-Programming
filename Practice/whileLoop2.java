import java.util.*;
public class whileLoop2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int sum=0;
        while(count<=n){
            
            sum=sum+count;
            
            count++;
        }
        System.out.println(sum);

    }
    
}
