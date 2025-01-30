import java.util.Stack;

public class BalancedParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Ignore spaces
            if (ch == ' ') continue;

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } 
            // If closing bracket
            else {
                if (s.isEmpty()) {
                    return false; // No matching opening bracket
                }

                // Check for valid pair
                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '{' && ch == '}') ||
                    (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } 
                else {
                    return false; // Mismatched brackets
                }
            }
        }

        // If stack is empty, all brackets are matched
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({}[]"; // Expected: true
        System.out.println(isValid(str)); // Output: true
    }
}
