public class EVEN_ODD_BITmanipulation {
    public static void odd_OR_even(int num){
        int bitmask=1;
        if((num & bitmask)==1){
            System.out.println("odd number");

        }
        else{
            System.out.println("even number");
        }
    }
    public static void main(String[] args) {
        odd_OR_even(3);
        odd_OR_even(11);
        odd_OR_even(14);
        odd_OR_even(7);
        odd_OR_even(9);
    }
}
