// wap of finding sum of number where n=10 using recursion?
public class recursion2 {

    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfNumbers(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }

    public static int sumOfNumbers(int n) {
       
        if (n == 1) {
            return 1;
        }
        
        return n + sumOfNumbers(n - 1);
    }
}