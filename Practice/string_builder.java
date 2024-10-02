public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
            // o(26)
            // o(n^2)

        }System.out.println(sb.length());  
    }
    
}
