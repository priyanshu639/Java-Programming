public class remove_loop_LL {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return; // No cycle found
        }

        // Find the meeting point
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast; // Track the previous node of fast
            slow = slow.next;
            fast = fast.next;
        }

        // Remove cycle
        prev.next = null;
    }

    public static void main(String args[]) {
        
        head = new Node(1);
        head.next = new Node(2);
        Node temp = head.next;
      
        head.next.next = new Node(3);
        head.next.next.next = temp; // Create a cycle: 1 -> 2 -> 3 -> 1

        System.out.println("Cycle detected: " + isCycle());
        removeCycle();
        System.out.println("Cycle detected after removal: " + isCycle());
    }
}
