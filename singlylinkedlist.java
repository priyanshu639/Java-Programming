
    class Node{
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }
        
    }

    class singlylinkedlist{
        Node head;
        //  insert at the begining
         
        void atBegin(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }


        // insert at the end
        void atlast(int data){
            Node newNode=new Node(data);
            // traversing the ll
            if(head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;


        }

        // adding to any position 
        void inserttoposition(int data,int position){
            Node newNode=new Node(data);
            if(position==0){
                newNode.next=head;
                head=newNode;
                return;
            }
            Node temp=head;
            for(int i=0;i<position-1 && temp!=null;i++){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Position out of bounds.");
                return;
            }
            newNode.next=temp.next;
            temp.next=newNode;

        }

        void display(){
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data + "-->");
                temp=temp.next;
            }
            System.out.println("null");

        }
    
    public static void main(String[] args) {
        singlylinkedlist list = new singlylinkedlist();
        list.atBegin(10); // List: 10 -> null
        list.atlast(20);       // List: 10 -> 20 -> null
        list.atBegin(5); // List: 5 -> 10 -> 20 -> null
        list.inserttoposition(15, 2); // List: 5 -> 10 -> 15 -> 20 -> null

        list.display(); // Output: 5 -> 10 -> 15 -> 20 -> null
    }
    
}
