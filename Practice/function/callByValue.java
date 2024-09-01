public class callByValue {


    public static void change(int a,int b){
        int temp =a;
        a = b;
        b=temp;
        System.out.println(" the value of a is : " + a);
        System.out.println("the value of b is : " + b);
        
    }
    public static void main(String[]args){
        int a = 10;
        int b=5;
        
        change(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    
}
