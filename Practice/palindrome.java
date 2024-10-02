public class palindrome {
    public static boolean palindrome(String str){
    for(int i=0;i<str.length()/2;i++){
        int n=str.length();

        if(str.charAt(i)==str.charAt(n-1-i)){
            // System.err.println("the string " + str + "is palindrome" );
            return true;
        }
        // else {
        //     System.out.println("the string "+ str +"is not palindrome");
        // }
        
    }
    return false; 
}
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(palindrome(str));
    }
    
}
