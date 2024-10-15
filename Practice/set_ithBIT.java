public class set_ithBIT {
    public static int set_ith_bit(int num,int i){
        
        int bitmask=1<<i;   
            return num|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(set_ith_bit(10,2));
    }
    
}
