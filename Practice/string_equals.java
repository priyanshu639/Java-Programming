public class string_equals {
    public static void main(String[] args) {
        String s1="tonny";
        String s2="tonny";
        String s3=new String("tonny");
        // if(s1==s2){
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }
        // if(s1==s3){
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }
        if(s1.equals(s3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
    
}
