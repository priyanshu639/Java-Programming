
class LinkedList {

    Node head; 

    
    class Node {
        int data;
        Node next;
        Node(int d) { 
            data = d;
            next = null;
        }
    }

 
    public void append(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }


    public void deleteNode(int key) {
        Node temp = head, prev = null;

   
        if (temp != null && temp.data == key) {
            head = temp.next; 
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }


        if (temp == null) {
            System.out.println("Node with value " + key + " not found.");
            return;
        }

      
        prev.next = temp.next;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original Linked List:");
        list.printList();

        
        list.deleteNode(30);

        System.out.println("Linked List after deleting node with value 30:");
        list.printList();
    }
}
