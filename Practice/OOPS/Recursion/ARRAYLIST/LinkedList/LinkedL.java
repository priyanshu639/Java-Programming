
public class LinkedL {
    public class  Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }

    }
    public static  Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
    // step 1-->creating a node
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;

    }

    // step 2 newNode next=head
    newNode.next=head; //link
    
    // step 3--> head=newNode
    head=newNode;
    }


    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;

        }
        tail.next=newNode;
        tail=newNode ;
    }

    public void Print(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public  void addMid(int idx,int data){
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
           temp=temp.next;
            i++;
        }
        // i=idx-1; temp-->prev
        newNode.next=temp.next;
        temp.next=newNode;


    }
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }


    public int removeLastt(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }

        // prev : i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }


        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
// iterative search
    public int itrSearch(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){
           if(temp.data==key){//key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    // recursive search

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public  void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    } 

    public void deleteNthfromEnd(int n){
        // calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;//removeFirst
            return;
        }
        // sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return ;
    }


    public Node findmidOfLL(Node head){
        Node slow=head;
        Node fast=head;
         
        while(fast!=null && fast.next!=null){
            slow=slow.next;// +1
            fast=fast.next.next;//+2
        }
        return slow;//slow is my mid node
    }

    public boolean checkPalindrome(){
        if(head==null ||head.next==null){
            return true;
        }
        // step 1 find mid
        Node midNode=findmidOfLL(head);
        // Step 2 reverse the ll

        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node right=prev;
        Node left=head;

        // check left half and right half

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }


   
    public static void main(String []args){
        LinkedL ll=new LinkedL();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(2);
        ll.addMid(4,1);
        ll.Print();
        // ll.removeFirst();
        // System.out.println(ll.size);
        // ll.Print();

        // ll.removeLastt();
        // ll.Print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.size);

        // System.out.println(ll.recSearch(3));

        // ll.reverse();
        // ll.Print();


        ll.deleteNthfromEnd(3);
        ll.Print();

        System.out.println(ll.checkPalindrome());

    }

    
}

