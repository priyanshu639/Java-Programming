import java.util.Stack;

public class ReverseStringStack {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while (idx < str.length()) { // Fixed '<' symbol
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString(); // Return the reversed string
    }

    public static void main(String[] args) {
        String str = "hello";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }
}
