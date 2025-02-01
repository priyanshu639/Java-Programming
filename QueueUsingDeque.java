import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // Add element to the queue (enqueue)
        public void add(int data) {
            deque.addLast(data);
        }

        // Remove element from the queue (dequeue)
        public int remove() {
            if (deque.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;  // Handle empty queue case
            }
            return deque.removeFirst();
        }

        // Get front element of the queue (peek)
        public int peek() {
            if (deque.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;  // Handle empty queue case
            }
            return deque.getFirst();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();

        // Adding elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);

        // Display front element
        System.out.println("Peek = " + q.peek());  // Output: Peek = 1

        // Removing elements
        System.out.println(q.remove());  // Output: 1
        System.out.println(q.remove());  // Output: 2
        System.out.println(q.remove());  // Output: 3

        // Trying to remove from an empty queue
        System.out.println(q.remove());  // Output: Queue is empty!
    }
}
