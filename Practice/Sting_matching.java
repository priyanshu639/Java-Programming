public class Sting_matching {
     static void sm(String t,String p){
        int l1=t.length();
        int l2=p.length()
        int j;
        for(int i=0;i<l1-l2;i++){
            for( j=0;j<l2;j++){
                if(t.charAt(i+j)!=p.charAt(j)){
                    break;
                }
            }
            if(j==l2){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        String t="ababcababbaaabcdab";
        String p="abc";
        sm(t,p);
    }
    
}
