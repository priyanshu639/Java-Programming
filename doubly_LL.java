public class doubly_LL {
    
    public class Node {
        int data;
        Node next;
        Node prev;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public doubly_LL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
// add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // printing

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
// removing first
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        doubly_LL dll = new doubly_LL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println("Size: " + dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println("Size: " + dll.size);
        dll.reverse();
        dll.print();
    }
}
