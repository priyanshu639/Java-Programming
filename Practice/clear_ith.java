public class clear_ith {
    
        public static int clear_bit(int num,int i){
            
            int bitmask=~(1<<i);
            
                return num & bitmask;
    
            
    
    
        }
        public static void main(String[] args) {
            System.out.println(clear_bit(10,1));
        }
        
}
    
    

