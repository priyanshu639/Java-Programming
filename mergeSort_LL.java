import java.util.LinkedList;

public class mergeSort_LL {

    // Node class definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Get mid node
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    // Merge two sorted linked lists
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); // Dummy node
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Add remaining nodes from head1 or head2
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next; // Return the merged linked list, skipping dummy node
    }

    // Merge sort for linked list
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find mid
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively sort left and right halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge sorted halves
        return merge(newLeft, newRight);
    }

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        mergeSort_LL ll = new mergeSort_LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // 5 -> 4 -> 3 -> 2 -> 1 -> null

        System.out.println("Original List:");
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted List:");
        ll.print();
    }
}
