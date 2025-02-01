import java.util.*;

public class DequeA {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements at both ends
        deque.addFirst(10); // Front
        deque.addLast(20);  // Rear
        deque.addFirst(5);
        deque.addLast(25);

        System.out.println("Deque: " + deque); // Output: [5, 10, 20, 25]

        // Accessing elements
        System.out.println("Front: " + deque.getFirst()); // Output: 5
        System.out.println("Rear: " + deque.getLast());   // Output: 25

        // Removing elements from both ends
        deque.removeFirst(); // Removes 5
        deque.removeLast();  // Removes 25

        System.out.println("Deque after removal: " + deque); // Output: [10, 20]

        // Checking if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());

        // Clearing the deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
    }
}

    
