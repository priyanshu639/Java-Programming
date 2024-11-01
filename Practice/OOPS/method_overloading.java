public class method_overloading {
    public static void main(String[] args) {
        calculator calci=new calculator();
        System.out.println(calci.sum((float)5.6, (float)6.8));
        System.out.println(calci.sum(5, 10));
        System.out.println(calci.sum(4, 3, 2));
        
    }
    
}

class calculator{
   int sum(int a,int b){
    return a+b;
   }
   float sum(float a,float b){
    return a+b;
   }
   int sum(int a,int b,int c){
    return a+b+c;
   }
}
