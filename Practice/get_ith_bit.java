public class get_ith_bit {
    public static int get_bit(int num,int shift){
        
        int bitmask=1<<shift;
        if((num & bitmask)==0){
            return 0;

        }
        else{
            return 1;
        }


    }
    public static void main(String[] args) {
        System.out.println(get_bit(10,2));
    }
    
}
