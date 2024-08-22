public class Example {
    public void mymethod(){
        int a=10;
    if (a==10){
        int b=20;
        System.out.println("inside if block ,b =" +b);
    }
    System.out.println("value of a= " +a);

    }
        public static void main(String[]args)
        {
            Example exam=new Example();
            exam.mymethod();
        }    
}
