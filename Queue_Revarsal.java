import java.util.*;
public class Queue_Revarsal {
        public static void reverse(Queue<Integer> q) {
            Stack<Integer> s = new Stack<>();
    
            // Move all elements from queue to stack
            while (!q.isEmpty()) {
                s.push(q.remove());
            }
    
            // Move all elements back from stack to queue
            while (!s.isEmpty()) {
                q.add(s.pop());
            }
        }
    
        public static void main(String args[]) {
            Queue<Integer> q = new LinkedList<>();
    
            // Adding elements to the queue
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
    
            // Reverse the queue
            reverse(q);
    
            // Print reversed queue
            while (!q.isEmpty()) {
                System.out.print(q.remove() + " ");  // Output: 5 4 3 2 1
            }
            System.out.println();
        }
    }
    
    

