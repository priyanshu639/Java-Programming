import java.util.Queue;

public class queue_LL {
    
    // Node class for Linked List
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class
    static class Queue {
        static Node head = null;
        static Node tail = null;

        // Check if the queue is empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Enqueue (Add element to the queue)
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Dequeue (Remove element from the queue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) { // If only one element exists
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // Peek (Get the front element)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    // Main method to test the Queue
    public static void main(String[] args) {
        Queue q = new Queue();
        
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}


    

