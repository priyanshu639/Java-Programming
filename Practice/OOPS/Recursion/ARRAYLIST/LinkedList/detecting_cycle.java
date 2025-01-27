public class detecting_cycle {
    // Node class to represent each node in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to detect a cycle in the linked list
    public static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    public static void main(String[] args) {
        // Create the head of the linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Create a cycle
        head.next.next.next = head;

        // Check if the cycle exists
        System.out.println(isCycle(head)); // Output: true
    }
}
