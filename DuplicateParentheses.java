import java.util.Stack;

public class DuplicateParentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Closing bracket
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true; // Duplicate parentheses found
                }

                s.pop(); // Remove opening '('
            } 
            else {
                // Opening bracket or other characters
                s.push(ch);
            }
        }

        return false; // No duplicate parentheses found
    }

    public static void main(String[] args) {
        // Valid Strings
        String str1 = "((a+b))"; // Expected: true (Duplicate)
        String str2 = "(a-b)";   // Expected: false (No Duplicate)

        System.out.println(isDuplicate(str1)); // Output: true
        System.out.println(isDuplicate(str2)); // Output: false
    }
}
