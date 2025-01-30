
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // Remove smaller elements from stack
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            // If stack is empty, no greater element
            nxtGreater[i] = s.isEmpty() ? -1 : s.peek();

            // Push current element to stack
            s.push(arr[i]);
        }

        // Print the next greater elements
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}

    

