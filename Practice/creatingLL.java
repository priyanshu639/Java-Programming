import java.util.*;
public class creatingLL {
    static class Node{
        int data;
        Node next;
        // constructor to create new node
        Node(int data){
            this .data=data;
            this.next=null;
        } 


    }
    Node head=null;
    public void creation(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter data");
            data = sc.nextInt();
            Node new_node=new Node(data);
            if(head==null){
                head=new_node;

            }
            else{
                new_node.next=head;
                head=new_node;
            }
            System.out.println("do you want to add / if yes,print");
            n=sc.nextInt();

        }
        while(n==1);
        sc.close();
    }
    public void traverser(){
        Node temp=head;
        if(head==null){
            System.out.println("ll does not exist");
        }
        else {
            System.out.print("LL");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }



    }
    public static void main(String[] args) {
        creatingLL ll=new creatingLL();
        ll.creation();
        ll.traverser();
    }
}
