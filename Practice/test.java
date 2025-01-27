class Adder{
        static int add(int a,int b){return a + b;}
        static int add(int a,int b,int c){return a+b+c;}

    }
public class test{
        public static void main(String[] args) {
            System.out.println(Adder.add(4,6));
            System.out.println(Adder.add(3,4,5));
        }
    }
