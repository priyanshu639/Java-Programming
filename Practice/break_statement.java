import java.util.*;
public class break_statement {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<=100;i++){
            int m=sc.nextInt();
            if(m%10==0){
                
               
                System.out.println("i m out of the loop because u have enterd multiple of 10");
                break;
            }   
            


        }
    }
    
}
