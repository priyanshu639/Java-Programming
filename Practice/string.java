import java.util.*;
public class string {
    public static void printletters(String fullname){
        for(int i=0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i)+" ");

        }System.out.println();
    }
    public static void main(String[] args) {
        // char arr[]={'d','g','f'};
        // String str="asv";
        // String str2=new String("cvbnm");
        // // strings are immutable
        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.nextLine();
        // System.out.println(name);

        // String fullName="payare mohan ji";
        // System.out.println(fullName.length());

        // concatination
        String frstname="Priyanshu";
        String lstname="Prajapati";
        String fullname=frstname +" "+ lstname;
        // System.out.println(fullname);
        // System.out.println(fullname.charAt(0));

        printletters(fullname);
    }
    
}
