import java.util.LinkedList;

public class mergeSort_LL {
    private NodelgetMid (Node head) {
        Node slow = head;
        Node fast = head. next;
        while(fast != null && fast.next != null) {
        slow =
        slow-next;
        fast = fast.next.next;
        }
        return slow; //mid node
        }

        private Node merge(Node headi, Node head2) {
            Node mergedLL = new Node (-1);
            Node temp = mergedLL;
            
            while(head1 != null && head2 != null)
            
            if (headl. data <= head2. data) {
            
            temp.next = head1;
            
            head1 = head1. next;
            
            temp = temp. next;
            
            } else {
            
            temp.next = head2;
            
            head2 = head2. next;
            
            temp = temp-next;
            }
            }
            while (head1 != null) {
            temp.next = head1;
            head1 = head1. next;
            temp = temp.next;

            }
            while (head2 != null) {
                temp. next = head2;
                head2 = head2. next;
                temp = temp. next;
                return mergedLL. next;
            }


            public Node mergeSort (Node head) {
                if (head = null || head.next == null) {
                return head;
                }
                //find mid
                Node mid = getMid (head) ;
                //left & right MS
                Node rightHead = mid.next;
                mid.next = null;
                Node newLeft = mergeSort (head);
                Node newRight = mergeSort (rightHead);
                //merge
                return merge(newLeft, newRight);
    

public static vold main (String argst)
    LinkedList ll = new LinkedList();
    ll.addFirst (1);
    11.addFirst (2); 
    ll.addFirst(3);
    1l.addFirst(4);
    ll.addFirst(5);
    // 1/5->4→>3->2→>1
    }
    ll.print();
    ll.head = ll.mergeSort (ll. head);
    ll.print();
    }


