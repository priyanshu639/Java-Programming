import java.util.Deque;
import java.util.LinkedList;

 
    
public class Stack_Using_deque  {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // Push operation (Add element at the end)
        public void push(int data) {
            deque.addLast(data);
        }

        // Pop operation (Remove element from the end)
        public int pop() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;  // Handle empty stack case
            }
            return deque.removeLast();
        }

        // Peek operation (Get top element without removing)
        public int peek() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;  // Handle empty stack case
            }
            return deque.getLast();
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek = " + s.peek());  // Output: Peek = 3
        System.out.println("Pop = " + s.pop());    // Output: Pop = 3
        System.out.println("Pop = " + s.pop());    // Output: Pop = 2
        System.out.println("Peek = " + s.peek());  // Output: Peek = 1
    }
}


