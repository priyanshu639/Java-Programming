import java.util.*;
public class ifElse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=13 && age<=18){
            System.out.println("the age entered is tennager");

        }
        else{
            System.out.println("the age entterd is adult or child");
        }
    }
}